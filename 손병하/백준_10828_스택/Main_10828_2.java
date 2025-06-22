import java.util.Scanner; // Scanner
import java.util.Stack;   // Stack 사용

public class Main_10828_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 입력 받기 위한 Scanner 생성
        StringBuilder sb = new StringBuilder(); // 결과 출력을 위한 StringBuilder
        Stack<Integer> stack = new Stack<>();  // 정수형 스택

        int N = sc.nextInt();  // 명령어 개수
        sc.nextLine();  // 개행 문자 처리 (nextInt 이후 nextLine 대비)

        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();  // 한 줄 입력받음

            if (line.startsWith("push")) {
                // push 명령어인 경우, 숫자만 추출해서 스택에 삽입
                int value = Integer.parseInt(line.split(" ")[1]);
                stack.push(value);
            } else if (line.equals("pop")) {
                sb.append(stack.isEmpty() ? -1 : stack.pop()).append('\n');
            } else if (line.equals("size")) {
                sb.append(stack.size()).append('\n');
            } else if (line.equals("empty")) {
                sb.append(stack.isEmpty() ? 1 : 0).append('\n');
            } else if (line.equals("top")) {
                sb.append(stack.isEmpty() ? -1 : stack.peek()).append('\n');
            }
        }

        System.out.print(sb);  // 결과 한꺼번에 출력
        sc.close();  // 리소스 정리
    }
}
