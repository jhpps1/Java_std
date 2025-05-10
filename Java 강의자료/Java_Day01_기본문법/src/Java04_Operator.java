
public class Java04_Operator {
	public static void main(String[] args) {
		// 산술 연산자 : 수학적인 연산
		int a = 35;
//		int b = 10;
		double b = 10;
		
//		+, -< *, /, %
		System.out.println(a/b);  // 3 또는 3.5
		// 정수와 정수를 연산 -> 정수
		// 정수와 실수를 연산 -> 실수
		
		
		// 비교 연산자 : 결과가 true / false 값으로 나온다.
		int c = 100;
		int d = 1000;
		
		System.out.println(c == d);  // false
		System.out.println(c != d);  // true
		System.out.println(c > d);  // false
		
		String e = "Java";
		String f = "Python";
		String g = "Java";
		
		System.out.println(e == f);  // false
		System.out.println(e == g);  // true
		System.out.println(e.equals(f));  // false
		System.out.println(e.equals(g));  // true
		
		
		// 논리 연산자 : t/f 형태로 나온다.
		// && : 둘다 참이면 참
		// || : 적어도 하나가 참이면 참
		// ! : 결과를 반대로
		
		
		// 단락평가/단축평가 -> 앞의 조건을 보고 뒤를 확인할지말지 결정함
		// t && t
		// t && f
		// f && t
		// f && f
		
		// t || t
		// t || f
		// f || t
		// f || f
		
		
		// 대입 복합 연산자
		int h = 10;
		h = h + 10;
		// 컴퓨터쟁이들은 중복되게 쓰는 걸 싫어해!
		h += 10;
		
		
		// 단항 연산자(증감)
		int i = 0;
//		System.out.println(++i);  // 1  // 증가시키고 나서 보여줘
//		System.out.println(i++);  // 0  // 보여주고 증가시켜
		
		System.out.println(++i);  // 1
		System.out.println(--i);  // 0
		System.out.println(i--);  // 0
		System.out.println(i);  // -1

	}
}
