package assigment_3;

public class Maximum_Sum_Circular_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int maxiMum_Circular_Sum(int[] arr) {
		int l_sum = kadens_Algo(arr);

		int total_sum = 0;

		for (int i = 0; i < arr.length; i++) {
			total_sum += arr[i];
			arr[i] *= -1;
		}
		int mid_sum = kadens_Algo(arr);
		int circular_sum = total_sum + mid_sum; // - (- mid_sum);
		if (circular_sum == 0) {
			return l_sum;
		}
		return Math.max(l_sum, circular_sum);
	}

	public static int kadens_Algo(int[] arr) {
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
