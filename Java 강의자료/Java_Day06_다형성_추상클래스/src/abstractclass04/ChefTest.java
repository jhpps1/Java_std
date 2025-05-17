package abstractclass04;

public class ChefTest {
	public static void main(String[] args) {
		Chef[] chefs = new Chef[2]; // 한식 요리사, 일식 요리사를 몽땅 관리할 수 있음

		chefs[0] = new KFoodChef();
		chefs[0].cook();

		// 추상클래스 -> 미완성의 설계도 -> 인스턴스를 생성할 수 없음
		// 미완성인 부분을 만들어줄 순 없을까?
		// 익명 클래스 문법을 이용하여 1회 한정으로 구현하면 인스턴스를 생성할 수 있다.

		chefs[1] = new Chef() {

			@Override
			public void cook() {
				System.out.println("랜덤 요리를 한다");
			}
		};

		chefs[1].cook();

	}
}
