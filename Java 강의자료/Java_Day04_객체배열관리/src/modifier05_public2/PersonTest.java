package modifier05_public2;

import modifier05_public.Person;

public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person();
		
		p.age = 100;  // public : 다른 패키지도 접근이 가능하다.		
		p.info();
	}
}
