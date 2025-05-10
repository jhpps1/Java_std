
import java.util.Arrays;

public class Array03_배열의순회 {
	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 7, 9 };
		// 인덱스 순회
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

		// 직접 요소 순회
		// read only
		for (int x : nums) {
			System.out.println(x);
		}
		for (int x : nums) {
			x = x * 2;
		}  // 반영 안됨
		for (int x : nums) {
			System.out.println(x);
		}

		System.out.println(Arrays.toString(nums));  // [1, 3, 5, 7, 9]
	}
}
