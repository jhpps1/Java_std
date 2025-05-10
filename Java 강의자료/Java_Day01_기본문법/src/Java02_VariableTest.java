
public class Java02_VariableTest {
	public static void main(String[] args) {
		// 작명규칙
		
		int age;
		int Age;  // 대소문자를 구분하기 때문에 위와 다르다.
		int $age;
		int age123;
		// int 123age;  숫자로 시작할 수는 없다.
		
		int 나이;  // 권장하진 않아
		
		int a = 100;
		System.out.println(a);  // 100
		
		int b;
		System.out.println(b);  // 지역변수는 초기화되어야 한다
	}
}
