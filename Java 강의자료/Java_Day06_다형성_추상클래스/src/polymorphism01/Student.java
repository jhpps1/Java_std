package polymorphism01;

public class Student extends Person {
	String major;

	public Student() {
	}

	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}

	@Override // 해당 어노테이션을 작성하지 않아도 오버라이드는 된다.
	public void eat() {
		System.out.println("지식을 먹는다.");
	}

	public void study() {
		System.out.println("공부를 한다.");
	}

	@Override
	public String toString() {
		return "Student [major=" + major + ", name=" + name + ", age=" + age + "]";
	}

}
