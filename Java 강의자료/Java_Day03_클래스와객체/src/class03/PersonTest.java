package class03;

public class PersonTest {
	public static void main(String[] args) {
		// 설계도를 이용하여 실제 객체를 생성해보자.
		// Person -> 사용자 정의 자료형, 참조 자료형
		// 참조 자료형에는 new 키워드가 필요해!
		
		Person yang = new Person();
		yang.name = "Yang";
		yang.age = 45;
		yang.hobby = "Youtube";
		
		
		Person hong = new Person();
		hong.name = "Hong";
		hong.age = 25;
		hong.hobby = "Golf";
		
		
		yang.info();
		hong.info();

	}
	
}
