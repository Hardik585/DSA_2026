package lec_9;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 4, -1, 5, 3, 2, 1, 7 };
//		System.out.println(min_from_ith_index(arr, 2));
		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
		sort(arr);
		for (int val : arr) {
			System.out.print(val + " ");
		}

	}

	// Base of the selection Sort
	public static int min_from_ith_index(int[] arr, int idx) {
		int minI = idx;
		for (int i = idx + 1; i < arr.length; i++) {
			if (arr[minI] > arr[i]) {
				minI = i;
			}
		}
		return minI;
	}

	// Selection Sort
	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min = min_from_ith_index(arr, i);
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
}
