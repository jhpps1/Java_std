package week2.B_No3;
import java.io.*;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = 10;
        for (int tc = 1; tc <= T; tc++) {
            // 첫 번째 줄: 암호문 개수 N
            int N = Integer.parseInt(br.readLine());
            // 두 번째 줄: 원본 암호문 뭉치(이게 최선인가,,?)
            String line = br.readLine();
            String[] cryptogram = line.split(" ");
            // 배열 중간에 삽입/삭제 등 -> ArrayList 이거 써야 함
            ArrayList<Integer> arr = new ArrayList<>();
            for (String c : cryptogram) {
                arr.add(Integer.parseInt(c));
            }
            // 세 번째 줄: 명령어의 개수
            int M = Integer.parseInt(br.readLine());
            // 네 번째 줄: 명령어
            String commandLine = br.readLine();
            String[] commands = commandLine.split(" ");

            int i = 0;
            while (true) {
                if (i >= commands.length) break;

                switch (commands[i]) {
                    case "I":
                        int x = Integer.parseInt(commands[i + 1]);
                        int y = Integer.parseInt(commands[i + 2]);
                        for (int j = 0; j < y; j++) {
                            arr.add(x, Integer.parseInt(commands[i + 2 + y - j]));
                        }
                        i += (2 + y + 1); break;
                    case "D":
                        int z = Integer.parseInt(commands[i + 1]);
                        int a = Integer.parseInt(commands[i + 2]);
                        for (int j = 0; j < a; j++) {
                            arr.remove(z);  // 특정 인덱스(z) 요소 제거
                        }
                        i += 3; break;  // switch문에서 break 필수!!
                    case "A":
                        int b = Integer.parseInt(commands[i + 1]);
                        for (int j = 0; j < b; j++) {
                            arr.add(Integer.parseInt(commands[i + 2 + j]));
                        }
                        i += (1 + b + 1); break;
                }
            }

            // print: 줄바꿈 없이 출력
            // println: 줄바꿈 O
            System.out.print("#" + tc + " ");
            for (int k = 0; k < 10; k++) {
                // ArrayList<Integer>에서 특정 인덱스(k) 값 구하기. 언패킹 그런거 없다
                System.out.print(arr.get(k) + " ");
            }
            System.out.println();
        }
    }


}
