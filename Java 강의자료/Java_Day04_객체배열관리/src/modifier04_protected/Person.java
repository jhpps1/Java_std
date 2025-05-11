package modifier04_protected;

public class Person {
	protected String name;
	protected int age;
	
	
	protected void info() {
		// 나의 내부에 있으니 나는 접근이 되더라
		name = "Yang";
		
	}
}
