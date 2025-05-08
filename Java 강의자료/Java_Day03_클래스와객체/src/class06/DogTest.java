package class06;

public class DogTest {
	public static void main(String[] args) {
		// 생성자가 하나라도 정의되어 있으면 컴파일러는 기본 생성자를 추가하지 않음!
//		Dog d = new Dog();  
//		
//		d.name = "마루";
//		d.age = 4;
		
//		Dog d = new Dog("꼽이", 8);
		
		Dog d = new Dog(10);
		
		System.out.println(d.name + " : " + d.age);
	}
}