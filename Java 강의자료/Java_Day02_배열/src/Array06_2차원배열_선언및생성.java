

import java.util.Arrays;

public class Array06_2차원배열_선언및생성 {
	public static void main(String[] args) {
		
		// 선언
		int [][] arr1;  // 권장!
		int [] arr2[];
		int arr3[][];
		
		int[][] arr4 = new int[2][3];  // 행의 크기 2, 열의 크기 3
		System.out.println(arr4[0]);  // [I@24b1d79b : 주소가 나온다.
		System.out.println(arr4[0][0]);  // 0 : 값이 나온다.
		
		// 2차원 배열 출력
		for(int i = 0 ; i < arr4.length; i++) {
			System.out.println(Arrays.toString(arr4[i]));
		}
		// 이런 것도 있음!
		System.out.println(Arrays.deepToString(arr4));
		
		int[][] arr5 = new int[3][];  // {null, null null}
		arr5[0] = new int[] {1, 2, 3};
		arr5[1] = new int[] {5, 6, 7, 8, 9};
		arr5[2] = new int[] {1};
	} 
}
