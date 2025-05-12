package inheritance05_final;

public class Person {
	String name;
	protected int age;
	
	final String PNAME = "안녕";
	final String PNAME2;

	public Person() {
		super(); // Object 기본 생성자를 호출
		PNAME2 = "하이";
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		PNAME2 = "하이2";
	}
	
	// 파이널을 붙였어
	public final void eat() {
		System.out.println("음식을 먹는다.");
	}
	
	public void eat(double time) {
		
	}
}
