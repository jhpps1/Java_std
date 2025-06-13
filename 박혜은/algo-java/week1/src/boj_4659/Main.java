package boj_4659;

import java.util.*;

public class Main {

    // input 넣어서 출력하는 부분
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {  // true, false는 소문자로 쓰자.

            String pwd = sc.nextLine();  // 선언과 동시에 초기화
            if (pwd.equals( "end")) {
                break;  // ;를 꼭 붙이자
            }
            if (isAcceptable(pwd)) {
                System.out.println("<" + pwd + "> is acceptable.");
            } else {
                System.out.println("<" + pwd + "> is not acceptable.");
            }
        }
    }

    // isAcceptable 함수 선언
    public static boolean isAcceptable(String pwd) {
        // 파이썬으로 치면 vowels = set("aeiou")를 만드는 코드인데 이해 불가;;
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        boolean hasVowel = false;
        int vowelCount = 0;
        int consonantCount = 0;
        char prevChar = 0;  // char에서 0 -> null을 의미

        for (char ch : pwd.toCharArray()) {  // 문자 하나씩 순회
            if (vowels.contains(ch)) {
                hasVowel = true;
                vowelCount++;
                consonantCount = 0;
            } else {
                consonantCount ++;
                vowelCount = 0;
            }

            // 2. 모음 3개 또는 자음 3개 연속
            if (vowelCount == 3 || consonantCount == 3) {
                return false;
            }

            // 3. 같은 글자 연속 (ee, oo 제외)
            if (ch == prevChar && ch != 'e' && ch != 'o') {
                return false;
            }

            prevChar = ch;
        }

        return hasVowel;

    }
}
