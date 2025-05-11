package modifier02_private;

public class Person {
	private String name;
	private int age;
	
	
	private void info() {
		// 나의 내부에 있으니 나는 접근이 되더라
		name = "Yang";
		
	}
}
