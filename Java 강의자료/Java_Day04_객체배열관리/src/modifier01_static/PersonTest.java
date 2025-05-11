package modifier01_static;

public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "yang";
		
		System.out.println(p.name);
		System.out.println(p.pCount++);
		
		Person p2 = new Person();
		System.out.println(++p2.pCount);
		System.out.println(Person.pCount);  // 클래스 변수는 클래스명으로 접근
		
		p.eat();
		p.study();
		
		Person.eat();
	}
	
	
}
