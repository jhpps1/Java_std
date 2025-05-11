package pkg1;

import pkg1.pkg2.Pack;

public class PackTest {
	public static void main(String[] args) {
		Pack p = new Pack();  // pkg1 안에 있는 Pack을 가져옴
		// pkg2 안에 있는 Pack을 가져오고 싶다면, import
		
		pkg1.pkg2.Pack p2 = new pkg1.pkg2.Pack();
		System.out.println(p.pkg);
		System.out.println(p2.pkg);
	}
}
