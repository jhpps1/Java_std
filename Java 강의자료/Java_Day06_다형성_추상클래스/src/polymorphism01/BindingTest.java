package polymorphism01;

class Parent {
	String x = "parent";
	
	public String method() {
		return "parent method";
	}
	
	public static String method2() {
		return "static parent method";
	}
}

class Child extends Parent{
	String x = "child";
	
	public String method() {
		return "child method";
	}
	
	public static String method2() {
		return "static child method";
	}
	
}

public class BindingTest {
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		
//		System.out.println(p.x);
//		System.out.println(c.x);
		
		// 동적 바인딩 -> 둘 다 child method가 나온다.
//		System.out.println(p.method());
//		System.out.println(c.method());
		
		////////////////
		// 정적 메서드(static) -> 동적 바인딩과는 거리가 좀 있다.
		System.out.println(p.method2());
		System.out.println(c.method2());
		
	}
}
