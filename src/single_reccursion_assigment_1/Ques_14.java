package single_reccursion_assigment_1;

import java.util.Scanner;

public class Ques_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(isSorted(arr, 0));

	}

	public static boolean isSorted(int[] arr, int start) {
		if ( arr.length <= 1 || start == arr.length - 1) {
			return true;
		}
		if (arr[start] > arr[start + 1]) {
			return false;
		}
		return isSorted(arr, start + 1);

	}
}
