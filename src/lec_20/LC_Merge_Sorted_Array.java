package lec_20;

public class LC_Merge_Sorted_Array {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };
		int[] ans = new int[nums1.length];
		int m = 3, n = 3;
		Mymerge(nums1, nums2, ans, m, n);
		for(int elm : ans) {
			System.out.print(elm+" ");
		}
	}

	private static void Mymerge(int[] nums1, int[] nums2, int[] ans, int m, int n) {
		int i = 0, j = 0, k = 0;
		while (i < m && j < n) {
			if (nums1[i] < nums2[j]) {
				ans[k++] = nums1[i++];
			} else {
				ans[k++] = nums2[j++];
			}
		}
		while (i < m) {
			ans[k++] = nums1[i++];
		}
		while (j < n) {
			ans[k++] = nums2[j++];
		}
	}

}
