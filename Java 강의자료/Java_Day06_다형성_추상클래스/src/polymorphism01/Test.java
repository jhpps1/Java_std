package polymorphism01;

public class Test {
	public static void main(String[] args) {
		Student st = new Student();  // 가능
		Person p = new Student();  // 학생은 사람이야!
		Object obj = new Student();  // 학생은 객체야!
		
//		Student st2 = new Person();  // 이건 불가능
		
		// 참조를 바꾸더라도 실제 메모리에 생성되어있는 인스턴스는 변함이 없다.
		
		st.eat();  // 지식을 먹는다.
		p.eat();  // 참조타입은 Person이지만 Student에서 eat이라는 메서드를 재정의했음
		// 따라서 Student의 eat() 메서드가 동작하게 됨. -> 동적 바인딩
		
		
	}
}
