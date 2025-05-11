package modifier03_default;

public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person();
		
		p.age = 100;  // default : 같은 패키지면 접근이 가능하다.
		p.info();
		
		// private : 같은 클래스 안에서만 접근이 가능하다.
		
		
	}
}
