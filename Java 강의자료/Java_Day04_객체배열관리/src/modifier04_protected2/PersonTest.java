package modifier04_protected2;

import modifier04_protected.Person;

public class PersonTest extends Person {  // extends: 상속을 위해서 쓰는 키워드
	public static void main(String[] args) {
		Person p = new Person();
		// p.  이거는 다른 패키지라서 당연히 안됨
		
		// 상속을 받은 뒤 해당 객체를 통해서 접근이 가능하다.
		PersonTest pt = new PersonTest();
		pt.age = 100;
	}
}
