package modifier07_object_array;

public class PersonManager {
	// 배열은 고정된 크기
	int size = 0;
	private Person[] arr = new Person[100];

	// 싱글턴 2장: 나는 내가 만들어
	// 싱글턴 4장: 너도 메모리에 올라가 있어라!
	private static PersonManager instance = new PersonManager();

	// 싱글턴 1장: 외부에서 생성하지 못하게 하라!
	private PersonManager() {
	}

	// 싱글턴 3장 : 내가 만든 나를 외부에서 쓸 수 있게 오픈 -> 이슈 발생
	// 싱글턴 3-1장: 메모리에 올려놓자
	public static PersonManager getInstance() {
		return instance;
	}

	
	public void addPerson(Person p) {
		if (size < arr.length) {
			arr[size] = p;
			size++;
		} else {
			System.out.println("더이상 사람을 기억할 수 없어... 미안해");
		}
	}
}
