package lec_20;

public class Merge_Two_Sorted_Array {
	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 0, 0, 0 };
		int[] num2 = { 2, 5, 6 };

		int[] arr1 = { 2, 3, 4, 7 };
		int[] arr2 = { 1, 3, 4, 11, 13, 15 };

		int[] ans = new int[arr1.length + arr2.length];

		merge(arr1, arr2, ans);
		for (int elm : ans) {
			System.out.println(elm);
		}
	}

	public static void merge(int[] arr, int[] arr2, int[] ans) {

		int i = 0, j = 0, k = 0;
		while (i < arr.length && j < arr2.length) {
			if (arr[i] <= arr2[j]) {
				ans[k++] = arr[i++];
			} else {
				ans[k++] = arr2[j++];
			}
		}
		while (i < arr.length) {
			ans[k++] = arr[i++];
		}
		while (j < arr2.length) {
			ans[k++] = arr2[j++];
		}
	}

}
