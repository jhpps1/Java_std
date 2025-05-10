
public class Java06_반복문1 {
	public static void main(String[] args) {
		// for (초기화; 조건식; 증감식) { 반복 내용 }
		// 조건식을 비워두면 항상 참으로 인식해서 끝나지 않음
		// 반복 횟수를 알고 있을 때 사용하면 좋다.

		// 1~5까지 출력해!
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);

		for (int i = 1; i <= 5; ++i) {
			System.out.println(i);
		}

		// 중첩 가능 -> 구구단을 출력해보시오.
		for (int i = 1; i <= 9; ++i) {
			for (int j = 1; j <= 9; ++j) {
				System.out.println(i * j);
			}
		}
	}
}
