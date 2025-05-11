package modifier06_getter_setter;

public class Person {
	// private : 외부에서 접근할 수 없음
	private String name;
	private int age;
	private String hobby;

	public Person() {

	}

	public Person(String name) {
		this.name = name;
	}

	// 설정자 생성 : 현재 객체 맴버변수의 값을 바꿈
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		if (age < 0) {
			System.out.println("나이는 음수는 안된다.");
		} else if (age >= 130) {
			System.out.println("당신은 로보트 입니까?");
		} else {
			this.age = age;
		}
	}

	
	
	// 접근자 생성 : 현재 객체의 멤버변수 값을 가져옴
	public String getName() {
		return name;
	}

	
	
	public void info() {
		System.out.println(name + " 입니다.");
	}

}
