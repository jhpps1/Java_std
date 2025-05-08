package class03;

public class Person {
	String name;
	int age;
	String hobby;
	
	
	void info() {
		System.out.printf("나의 이름은 %s입니다. %n나이는 %d세, 취미는 %s입니다.%n", name, age, hobby);
	}

}