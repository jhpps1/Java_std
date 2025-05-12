package inheritance03_super;

class Parent {
	String name = "부모님 이름";

	void eat() {
		System.out.println("냠냠");
	}
}

class Child extends Parent {
	String name = "자식 이름";

	void printName() {
		System.out.println(super.name); // 이름이 동일할 경우, super 사용
		System.out.println(name);
	}

	void eat() {
		super.eat();
		System.out.println("쩝쩝");
	}
}

public class SuperTest { // public class는 딱 하나만 만들 수 있다
	public static void main(String[] args) {
		Child child = new Child();
		System.out.println(child.name); // 자식 이름
		child.printName(); // 부모님 이름 자식 이름

		child.eat(); // 냠냠 쩝쩝

	}

}
