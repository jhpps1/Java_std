package class04;

public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person();
		
		// 인자보다 매개변수가 더 큰 범위라면, 묵시적 형변환
		// 인자보다 매개변수가 더 작은 범위라면, 명시적 형변환
		p.study(10);
		p.study((int) 10.0);

	}
	
}
