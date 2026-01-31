package lec_8;

public class Rotate_Array {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		rotate(nums, k);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	public static void rotate(int[] nums, int k) {
		int len = nums.length;
		k = k % len;
		for (int i = 1; i <= k; i++) {
			int item = nums[len - 1];
			for (int j = len - 2; j >= 0; j--) {
				nums[j + 1] = nums[j];
			}
			nums[0] = item;
		}

	}
}
