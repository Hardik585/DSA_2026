package lec_7;

public class Find_Pivot_Index_2 {
	public static void main(String[] args) {
		int[] nums = { 1, 7, 3, 6, 5, 6 };
		System.out.println(pivotIndex(nums));
	}

	public static int pivotIndex(int[] nums) {
		int[] prefix = new int[nums.length];
		int[] sufix = new int[nums.length];
		prefix[0] = 0;
		sufix[nums.length-1] = 0; // no need
		for (int i = 1; i < nums.length; i++) {
			prefix[i] = prefix[i - 1] + nums[i - 1];
		}
		for (int i = nums.length-2; i >= 0; i--) {
			sufix[i] = sufix[i + 1] + nums[i + 1];
		}
		for (int i = 0; i < nums.length; i++) {
			if (sufix[i] == prefix[i]) {
				return i;
			}
		}
		return -1;
	}
}
