package lec_9;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 4, 5, 3, 2, 1 };
		sort(arr);
		for(int val : arr) {
			System.out.print(val + " ");
		}
	}
 
	public static void sort(int[] arr) {
		// turn
		for (int turn = 1; turn < arr.length; turn++) {
			for (int j = 0; j < arr.length - turn; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
