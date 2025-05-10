
public class Java05_조건문3 {
	public static void main(String[] args) {
		// 점수 예제
		// 90점 이상 A / 80점 이상 90점 미만 B / 70이상 80미만 C / 그 외 F
		int score = 75;
		if (score >= 90) {
			System.out.println("A");
		} else {
			// 90점 미만
			if (score >= 80) {
				System.out.println("B");
			} else {
				// 80점 미만
				if (score >= 70) {
					System.out.println("C");
				} else {
					System.out.println("F");
				}
			}
		}

		// ctrl + shift + f : 자동 정렬
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}
	}
}