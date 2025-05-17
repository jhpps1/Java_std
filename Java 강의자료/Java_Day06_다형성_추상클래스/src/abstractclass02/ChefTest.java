package abstractclass02;

public class ChefTest {
	public static void main(String[] args) {
		Chef[] chefs = new Chef[2]; // 한식 요리사, 일식 요리사를 몽땅 관리할 수 있음

		chefs[0] = new KFoodChef();
		chefs[1] = new JFoodChef();

//		for (Chef chef : chefs) {
//			chef.eat();
//			chef.cook(); // 동적 바인딩으로 인해서 한식/일식을 조리하게 됨.
//		}

		for (Chef chef : chefs) {
			if (chef instanceof KFoodChef) {
				KFoodChef k = (KFoodChef) chef;
				k.cook();
			} else if (chef instanceof JFoodChef) {
//				(JFoodChef)chef.cook();
				// 연산자의 우선순위를 고려해야 한다!
				((JFoodChef)chef).cook();
				
			}
		}
	}
}
