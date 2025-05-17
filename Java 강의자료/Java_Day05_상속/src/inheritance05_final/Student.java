package inheritance05_final;

// extends 키워드를 이용하여 상속받는다.
public final class Student extends Person {

	String major;

	public Student() {
		super(); // 기본적으로 생략이 되어 있음 : 부모의 기본생성자를 호출!
//		this("익명", 10, "자율전공");  this()는 super()와 같이 쓸 수 없음!
	}

	public Student(String name, int age, String major) {
	    super(name, age);
	    this.major = major;
	}
	
	public void study() {
		System.out.println("공부를 한다.");
	}
	
	// 이제는 안된다! (final이 붙은 메서드는 재정의할 수 없음)
//	@Override
//	public void eat() {
//		// 재정의. 네가 할 수 있는 건 내용 고치기밖에 없다
//		System.out.println("지식을 먹는다.");
//	}
	
	public void eat(int time) {  // 문제 없다. 이름만 똑같은 다른 친구
		
	}
}
