
import java.util.Scanner;

public class Main_1438 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		
		// 0의 그룹과 1의 그룹을 세는 변수 c0, c1
		int c0 = 0;
		int c1 = 0;
		
		// 첫 숫자 기준 세기
		if(s.charAt(0) == '0') {
			c0++;
		}
		else {
			c1++;
		}
		
		// 0과 1의 그룹 중 적은 횟수인 쪽이 뒤집는 횟수.
		// 다음 숫자와 비교했을 때 변화 확인하기
		// charAt(i)는 i번째 문자를 하나씩 꺼내기 위한 메서드 
		for (int i = 1; i < s.length(); i++) {
			// 이전 숫자와 같지 않을 때
			if (s.charAt(i) != s.charAt(i-1)) {
				if (s.charAt(i) == '0') {
					c0++;
				}
				else {
					c1++;
				}
			}
		}
		
		// 둘 중 작은 그룹 수 출력.
		System.out.print(Math.min(c0, c1));
	}
}
