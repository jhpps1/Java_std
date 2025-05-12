package inheritance03_super;

public class Person {
	String name;
	protected int age;

	public Person() { // private으로 바꾸면 -> Student.java에서 super() 못씀
		super(); // Object 기본 생성자를 호출
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void eat() {
		System.out.println("음식을 먹는다.");
	}
}
