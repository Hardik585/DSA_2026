package lec_7;

public class Reverse_Array {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 6, 2, 4, 16, 7, 8, 9 };
		revArr(arr);
		print(arr);
	}

	public static void revArr(int[] arr) {
		int start = 0, end = arr.length - 1;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
