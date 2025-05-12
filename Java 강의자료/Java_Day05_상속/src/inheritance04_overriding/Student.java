package inheritance04_overriding;

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
	
	// 메서드 오버라이딩
	// 상속 관계에서 사용할 수 있음
	// 부모클래스에서 정의된 메서드와 동일해야함. (메서드 이름, 매개변수, 반환 타입)
	@Override  // 해당 어노테이션을 넣음으로써 조금 더 명확성을 높임
	public void eat() {
		// 재정의. 네가 할 수 있는 건 내용 고치기밖에 없다
		System.out.println("지식을 먹는다.");
	}
	
	//메서드 오버로딩
	// 메서드명 동일하고, 매개변수 순서나 개수가 다른 것
	// 반환 타입만 다른거 -> no인정
	public void eat(int time) {
		System.out.println(time + "시간 만큼 지식을 먹었습니다.");
	}
	

	public String info() {
		return name + ":" + age;
	}
	
	@Override
	public String toString() {
		return "Student [major=" + major + ", name=" + name + ", age=" + age + "]";
	}
}
