import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        // 큐 선언
        Queue<Integer> queue = new LinkedList<>(); // queue를 사용할 것인데 링크드리스트로 만들 것임을명시 
        int last = -1; // 마지막으로 push된 값을 저장

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            String command = input[0];

            switch (command) {
                case "push":
                    int value = Integer.parseInt(input[1]);
                    queue.offer(value); // 큐에 값 추가 (add 대신에 사용 add를 사용하면 예외가 발생하지만 offer는 그냥 false반)
                    last = value;       // 마지막 값 갱신
                    break;

                case "pop":
                    sb.append(queue.isEmpty() ? -1 : queue.poll()).append('\n');
                    break;

                case "size":
                    sb.append(queue.size()).append('\n');
                    break;

                case "empty":
                    sb.append(queue.isEmpty() ? 1 : 0).append('\n');
                    break;

                case "front":
                    sb.append(queue.isEmpty() ? -1 : queue.peek()).append('\n');
                    break;

                case "back":
                    sb.append(queue.isEmpty() ? -1 : last).append('\n');
                    break;
            }
        }

        // 출력
        System.out.print(sb);
    }
}

