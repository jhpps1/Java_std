package polymorphism01;

public class Person {
	String name;
	int age;
	
	public Person() {
		// super();  // 상위 클래스의 기본 생성자 호출 (Object의 기본생성자)
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println("음식을 먹는다.");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
