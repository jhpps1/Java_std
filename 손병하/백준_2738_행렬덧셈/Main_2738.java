
import java.util.Scanner;

public class Main_2738 {
	public static void main(String[] args) {
		// (System.in) 으로 콘솔(키보드) 입력을 받는 Scanner 객체를 만듬.
		Scanner sc = new Scanner(System.in);
		
		
		// 행과 열 입력 받음.
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		// 2차원 배열 만들기. a행 b열의 정수 배열.
		int[][] A = new int[a][b];
		int[][] B = new int[a][b];
		
		
		// 행렬 A 입력
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		
		
		// 행렬 B 입력
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				B[i][j] = sc.nextInt();
			}
		}
		
		
		 /*
		 두 행렬 더하기. (사실 print에서 더해도 되지만, 이렇게 하면 성능이 떨어진다!)
		 print에서 하면 일일이 객체가 따로 생성(메모리가 따로 잡힘)되지만,
		 StringBuilder에서 하면 하나의 객체에서 연산을 처리한다.
		 어? 그럼 그냥 빈 배열(임의의 이름 C) 에 만들어서 해도 되지 않나??
		 메모리에서 조금 더 C배열을 만드는게 크게 사용되고, 코드 간결성이 저하되긴 하지만, 틀린방법은 아니다.
		 특히 결과를 다시 한번 사용하거나 다른 사용이 필요하다면 이것도 좋은 방법이다!!
		 하지만, 연산 결과를 출력하거나 계산과 출력의 분리가 필요하다면 StringBuilder가 더 좋다.
		 */
		for (int i = 0; i < a; i++) {
			StringBuilder c = new StringBuilder();
			for (int j = 0; j < b; j++) {
				c.append(A[i][j] + B[i][j]);
				if (j < b - 1) {
					c.append(' ');
				}
			}
			System.out.println(c.toString());
		}
		
		sc.close();
	}
}
