package lec_9;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = { 9, 1, 7, 4, 8, 2, 11 };
		insertLastElement(arr, arr.length - 1);
		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
		sort(arr);
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}

	// Base of the InsertionSort
	public static void insertLastElement(int[] arr, int i) {
		int item = arr[i];
		int j = i - 1;
		while (j >= 0 && arr[j] > item) {
			arr[j + 1] = arr[j];
			arr[j] = item;
			j--;
		}
		// return j+1; position ke liye
	}

	public static void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			insertLastElement(arr, i);
		}
	}
}
