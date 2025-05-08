package class06;

public class Dog {
	
	String name;
	int age;
	
	
	// ctrl + space -> 맨 위: 기본 생성자 생성
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
//	public Dog(int age) {
//		this.name = "우쭈쭈";
//		this.age = age;
//	}
	
	public Dog(int age) {
		this("우쭈쭈", age);  // this() : 반드시 최상단에 위치
		this.name = "바둑이";  // 얘가 밑에 와야한다 (순서 중요)
	}
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}