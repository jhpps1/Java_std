package inheritance01_no;

public class Test {
	public static void main(String[] args) {
		Person p = new Person(); // 기본 생성자가 있어서 이렇게 만들 수 있다

		Student st = new Student();

		// 서로 연관이 없음
		p.eat();

		st.eat();

	}
}
