package lec_20;

public class Merge_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 7, 2, 9, 6 };
		int[] ans = Sort(arr, 0, arr.length - 1);
		for (int elm : ans) {
			System.out.print(elm + " ");
		}
	}

	public static int[] Sort(int[] arr, int si, int ei) {
		if (si == ei) {
			int[] a = { arr[si] };
			return a;
		}
		int mid = (si + ei) / 2;
		int[] arr1 = Sort(arr, si, mid);
		int[] arr2 = Sort(arr, mid + 1, ei);
		return merge(arr1, arr2);

	}

	public static int[] merge(int[] arr, int[] arr2) {
		int i = 0, j = 0, k = 0;
		int[] ans = new int[arr.length + arr2.length];
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
		return ans;
	}

}
