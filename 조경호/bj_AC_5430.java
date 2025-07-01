import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            // 1. 패턴 받기
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine()); // 배열 개수
            String arr = br.readLine();

            Deque<Integer> dq = new ArrayDeque<>();
            if (n > 0) {
                String[] content =  arr.substring(1, arr.length() - 1).split(","); // 받은 배열 대괄호 빼주기
                for (String s : content) {
                    dq.add(Integer.parseInt(s)); // deque에 넣어주기
                }
            }
            boolean isR = false; // false일 때는 정방향, True일 떄는 반대로
            boolean isError = false; // 만약 배열이 0일때 d를 할려고 하면 error
            for (char c : p.toCharArray()) {
                if (c == 'R') {
                    isR = !isR;
                } else if (c == 'D') {
                    if (dq.isEmpty()) {
                        isError = true;
                        break; // 만약 비었으면 바로 error 처리
                    }
                    if (!isR) { // 만약 R로 바뀌지 않았으면 왼쪽 먼저
                        dq.pollFirst();
                    } else {
                        dq.pollLast();
                    }
                }
            }

            if (isError) {
                sb.append("error\n");
            } else {
                sb.append("["); // 대괄호 넣어주기
                if (!dq.isEmpty()){ // 덱이 비어있지 않다면 계속 넣어주기
                    if(!isR) { // r로 뒤빠귄 상태가 아니라면 그냥 출력
                        Iterator<Integer> it = dq.iterator();
                        sb.append(it.next());
                        while (it.hasNext()) {
                            sb.append(',').append(it.next());
                        }
                    } else{ // R이라면 역으로 출력
                        Iterator<Integer> it = dq.descendingIterator();
                        sb.append(it.next());
                        while (it.hasNext()) {
                            sb.append(',').append(it.next());
                        }
                    }
                }
                sb.append("]\n");
                }

        }
        System.out.print(sb.toString());
    }
}
