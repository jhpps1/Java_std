import java.util.Scanner;

public class password { // class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String password = sc.nextLine();
            if (password.equals("end")) break;

            if (isAcceptable(password)) {
                System.out.println("<" + password + "> is acceptable.");
            } else {
                System.out.println("<" + password + "> is not acceptable.");
            }
        }
        sc.close();
    }

    static boolean isAcceptable(String pw) {
        boolean hasVowel = false;
        int vowelCount = 0, consonantCount = 0;
        char prev = 0;

        for (int i = 0; i < pw.length(); i++) {
            char c = pw.charAt(i);

            if (isVowel(c)) {
                hasVowel = true;
                vowelCount++;
                consonantCount = 0;
            } else {
                consonantCount++;
                vowelCount = 0;
            }

            if (vowelCount >= 3 || consonantCount >= 3) {
                return false;
            }

            if (i > 0 && c == prev && !(c == 'e' || c == 'o')) {
                return false;
            }

            prev = c;
        }

        return hasVowel;
    }

    static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}

/*
* 이렇게 주석을 다는거였군
* 오늘은 스터디에서 내가 어떻게 해야할지 몰라서 일단 파일 하나를 지피티한테 풀게 하고, 궁금한 걸
* 물어가는 식으로 기본적인 내용들 파악 시작했읍니다.

* ✅ 1. import java.util.Scanner;
자바에서 입력을 받기 위한 Scanner 클래스를 불러옴

파이썬의 input()과 비슷하지만, 자바는 별도로 import해야 함

✅ 2. public class Main { ... }
자바에서 프로그램은 클래스 단위로 구성됨

Main 클래스 이름은 백준 제출용 고정값

public: 외부에서도 접근 가능하다는 의미

✅ 3. public static void main(String[] args)
자바 프로그램의 진입점(Entry Point)
하나하나 보면:

키워드	설명
public	누구든 접근 가능
static	객체 생성 없이 사용 가능
void	반환값 없음
main	자바 프로그램 시작점 이름
String[] args	실행 시 전달받는 문자열 배열 (커맨드라인 인자)

💡 파이썬: if __name__ == "__main__":과 유사한 역할

✅ 4. Scanner sc = new Scanner(System.in);
입력을 받기 위한 도구 생성

System.in: 표준 입력 (콘솔)

new: 객체 생성 키워드

🟢 파이썬 비교: input() → Scanner sc = new Scanner(System.in)

✅ 5. while (true) { ... }
무한 루프 시작

파이썬의 while True: 와 동일

✅ 6. String password = sc.nextLine();
한 줄 입력받아 문자열로 저장

String은 자바의 문자열 타입

nextLine()은 줄 전체를 입력받는 함수

✅ 7. if (password.equals("end")) break;
문자열 비교는 ==이 아닌 .equals()로 해야 함

파이썬: if password == "end": break

✅ 8. System.out.println(...)
표준 출력

println은 출력 후 줄바꿈까지 함

🟢 파이썬 비교: print(...)

✅ 9. isAcceptable(password) (함수 호출)
아래에 정의된 isAcceptable() 함수 호출

파이썬의 def 함수 호출과 동일

✅ 10. static boolean isAcceptable(String pw)
boolean: true/false를 반환하는 함수
static: 객체 없이도 사용 가능 (main과 같은 수준에서 호출 가능)
String pw: 문자열 매개변수

✅ 11. 지역변수 선언
boolean hasVowel = false;
int vowelCount = 0, consonantCount = 0;
char prev = 0;
선언문	// 의미
boolean	// true 또는 false 값 (불형)
int	    // 정수형 변수
char	// 문자 하나 (파이썬의 문자열 1글자와 비슷)

자바는 변수 타입을 반드시 선언해야 함.

✅ 12. for 루프 문법
for (int i = 0; i < pw.length(); i++) {
    ...
}
전통적인 C형 for문
pw.length()는 문자열의 길이
pw.charAt(i): i번째 문자
🟢 파이썬: for i in range(len(pw)): 와 비슷

✅ 13. 조건문
if (isVowel(c)) {
    ...
} else {
    ...
}
자바의 조건문은 ()를 반드시 사용해야 함
중괄호 {} 생략도 가능하지만 버그 위험 있음

✅ 14. 문자열 포함 확인
return "aeiou".indexOf(c) != -1;
'aeiou'에서 문자가 포함되었는지 확인
없으면 -1, 있으면 index 반환
*
🟢 파이썬: return c in "aeiou"

✅ 15. !=, ==, &&, ||, !
자바의 주요 비교 및 논리 연산자
연산자	    의미
==	        숫자/논리값 비교
.equals()	문자열 비교
!=	        같지 않음
&&	        AND
!	        NOT

✨ 전체 흐름 요약
main() 함수에서 입력 반복
isAcceptable()에서 조건 검사
모음 존재 여부
모음/자음 연속 3개
같은 글자 연속 2번 (단 ee, oo는 허용)
조건 만족하면 true, 아니면 false 반환
결과 출력

🧠 정리
파이썬	        자바
input()	        Scanner.nextLine()
print()	        System.out.println()
def	            static [타입] 함수명()
in, ==	        .indexOf(), .equals()
True/False	    true/false
str, int	    String, int, char 등 명시 필요
* */

