
public class Array01_배열의선언및생성 {
	public static void main(String[] args) {
		// 배열의 선언 2가지 방식
		int[] arr1;
		int arr2[];  // 비권장

		// 생성하는 방법
		int[] arr3 = new int[10];  // -> {0, 0, 0, ..., 0} (0이 열개)

		int[] arr4 = new int[] { 1, 2, 3, 4 };  // 직접 값을 주어서 만들었다.
		// 호기심이 조금 있으면 좋다! (이거 넣으면 되나?)
		int[] arr5 = { 1, 2, 3, 4 };  // 선언과 동시에 초기화

//		arr1 = {3, 4, 5, 6};  // 재할당 불가
		arr1 = new int[] { 1, 2, 3, 4 };  // 재할당 가능

		System.out.println(arr4[2]);  // 인덱스 접근 가능

		System.out.println(arr4.length);

	}
}
