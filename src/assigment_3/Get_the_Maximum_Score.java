package assigment_3;

public class Get_the_Maximum_Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	}

	public int maxSum(int[] nums1, int[] nums2) {
		return getMax(nums1, nums2);
	}

	public static int getMax(int[] arr1, int[] arr2) {
		int mod = 1000_000_007;
		int i = 0, j = 0, s1 = 0, s2 = 0;
		long ans = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] > arr2[j]) {
				j++;
			} else if (arr1[i] < arr2[j]) {
				i++;
			} else {
				long sum1 = revSum(arr1, s1, i);
				long sum2 = revSum(arr2, s2, j);
				ans = (ans + Math.max(sum1, sum2)) % mod;
				i++;
				j++;
				s1 = i;
				s2 = j;
			}
		}
		long sum1 = revSum(arr1, s1, arr1.length - 1);
		long sum2 = revSum(arr2, s2, arr2.length - 1);
		ans = (ans + Math.max(sum1, sum2)) % mod;
		return (int) ans;
	}

	public static long revSum(int[] arr, int start, int end) {
		long sum = 0;
		int i = start;
		for (; i <= end;) {
			sum = (sum + arr[i]);
			i++;
		}
		return sum;
	}
}
