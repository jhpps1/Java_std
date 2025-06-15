package backjoon;

import java.util.Scanner;

public class Main_scanner {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열 입력
        String name = sc.nextLine();

        // 정수 입력. 주의! nextInt()는 정수만 읽고 \n이 버퍼에 남아서 
        // 다음 메서드 진행시 \n처리로 공백 출력이 됨. 그래서 개행처리가 필요.
        int age = sc.nextInt();
        sc.nextLine();  // 개행 처리 (다음 줄 입력 전에 필요함)
        

        // 공백 기준으로 여러 문자열 입력
        String x = sc.next();
        String y = sc.next();

        sc.close();
        
     // 출력 (확인용)
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("단어1: " + x + ", 단어2: " + y);
    }
}
