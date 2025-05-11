package modifier01_static;

public class Person {
	
	// 클래스 변수 모든 클래스가 공유하는 값
	static int pCount = 1;
	// 인스턴스 변수 (생성되는 인스턴스마다 고유한 값을 가지고 있음)
	String name;
	int age;
	String hobby;
	
	// 초기화블록
	static {
		// 클래스 변수를 초기화 하기도 하지만...
		// 안에서 특정한 작업 또한 가능하다.
		pCount = 1000;
	}
	
	
	// 정적 메서드 (static)
	public static void eat() {
		pCount = 100;  // 가능
//		this.name = "Yang";  // 이건 안된다. (인스턴스 변수 -> 메모리에 없음)
	}
	
	// 메서드 (non-static)
	public void study() {
		pCount = 10000;
		name = "Yang";
	}
}
