package inheritance03_super;

// extends 키워드를 이용하여 상속받는다.
public class Student extends Person {

	String major;

	public Student() {
		super(); // 기본적으로 생략이 되어 있음 : 부모의 기본생성자를 호출!
//		this("익명", 10, "자율전공");  this()는 super()와 같이 쓸 수 없음!
	}
	
	/*
	public Student(String name, int age, String major) {
		super();
		this.name = name;
		this.age = age;
		this.major = major;
	}*/
	
	// 부모가 name과 age를 쓸 수 있는 생성자를 가지고 있다면
	public Student(String name, int age, String major) {
	    super(name, age);
	    this.major = major;
	}
	
	public void study() {
		System.out.println("공부를 한다.");
	}
}
