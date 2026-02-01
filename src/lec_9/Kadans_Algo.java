package lec_9;

public class Kadans_Algo {
	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(subArray_Sum(arr));
	}

	public static int subArray_Sum(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int curr_sum = 0;
		for (int i = 0; i < arr.length; i++) {
			curr_sum += arr[i];
			ans = Math.max(ans, curr_sum);
			if (curr_sum < 0) {
				curr_sum = 0;
			}
		}
		return ans;
	}
}
