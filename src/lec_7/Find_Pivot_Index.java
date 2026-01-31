package lec_7;

public class Find_Pivot_Index {

	public static void main(String[] args) {
		int[] arr = { 1, 7, 3, 6, 5, 6 };
		System.out.println(pivotIndex(arr));
	}

	public static int pivotIndex(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int leftSum = left(nums, 0, i - 1);
			int rightSum = right(nums, i + 1, nums.length - 1);
			if (leftSum == rightSum) {
				return i;
			}
		}
		return -1;
	}

	public static int left(int[] arr, int start, int end) {
		int ans = 0;
		while (start <= end) {
			ans += arr[start];
			start++;
		}
		return ans;
	}

	public static int right(int[] arr, int start, int end) {
		int ans = 0;
		while (start <= end) {
			ans += arr[start];
			start++;
		}
		return ans;
	}

}
