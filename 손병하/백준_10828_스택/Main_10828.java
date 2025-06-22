// 입력을 효율적으로 받기 위한 BufferedReader를 사용
import java.io.BufferedReader;

// IOException 예외 넘김을 위한 클래스. 이걸 안쓰면 try-catch 로 예외처리를 해야 한다.
import java.io.IOException;

// 표준 입력 스트림(System.in)을 BufferedReader에 연결
import java.io.InputStreamReader;

// Java의 기본 스택 클래스
import java.util.Stack;

// 문자열을 공백 기준으로 나누기 위한 도구 (push 1 같은 명령어 처리용)
import java.util.StringTokenizer;


public class Main_10828 {
	// 내부에서 처리하지 않고, JVM(자바 실행기)에게 전달. 예외를 넘긴다는 것.
    public static void main(String[] args) throws IOException {
    	
        // BufferedReader를 통해 사용자 입력을 빠르게 받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 출력 성능 향상을 위한 StringBuilder 사용
        StringBuilder sb = new StringBuilder();

        // 첫 번째 줄에서 명령의 개수 N을 정수로 입력 받음
        int N = Integer.parseInt(br.readLine());

        // 정수형 스택 선언
        Stack<Integer> stack = new Stack<>();

        // 총 N개의 명령어를 처리
        for (int i = 0; i < N; i++) {
        	
            // 명령어를 공백 기준으로 구분 (예: "push 3")
        	// br.readline() 사용자로부터 1줄 입력받기
        	// new StringTokenizer 공백을 기준으로 잘라서 '토큰' 단위로.
        	// ex) push 3 이 입력되면 push / 3
        	// cmd 변수에 저장.
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();  // 명령어 종류를 먼저 추출
            
            
            // switch 문 (조건) 
            switch (cmd) {
                case "push":
                    // push 명령의 경우, 다음 토큰(숫자)을 스택에 추가
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    // pop 명령: 스택이 비어있으면 -1, 아니면 맨 위 값을 꺼냄
                    sb.append(stack.isEmpty() ? -1 : stack.pop()).append('\n');
                    break;

                case "size":
                    // 스택의 크기 출력
                    sb.append(stack.size()).append('\n');
                    break;

                case "empty":
                    // 스택이 비어있으면 1, 아니면 0 출력
                    sb.append(stack.isEmpty() ? 1 : 0).append('\n');
                    break;

                case "top":
                    // 스택의 맨 위 값 출력 (비어있으면 -1)
                    sb.append(stack.isEmpty() ? -1 : stack.peek()).append('\n');
                    break;
            }
        }

        // 결과를 한꺼번에 출력
        System.out.print(sb);
    }
}
