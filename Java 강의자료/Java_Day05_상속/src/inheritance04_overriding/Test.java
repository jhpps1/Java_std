package inheritance04_overriding;

public class Test {
	public static void main(String[] args) {
		Student st = new Student();
		
		st.eat();
		st.eat(1);
		
		System.out.println(st);
		
		System.out.println(st.info());
	}
}
