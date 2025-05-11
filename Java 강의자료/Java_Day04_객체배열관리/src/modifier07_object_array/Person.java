package modifier07_object_array;

public class Person {
	private String name;
	private int age;
	private String hobby;
	
	public Person() {
	}
	
	public Person(String name, int age, String hobby) {
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}
	// 설정자와 접근자가 필요
	// 우클릭 -> Source -> Generate Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", hobby=" + hobby + "]";
	}
	
	
}
