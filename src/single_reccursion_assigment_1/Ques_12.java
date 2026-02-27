package single_reccursion_assigment_1;

import java.util.Scanner;

public class Ques_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print(minElm(arr, 1));
	}

	public static int minElm(int[] arr, int start) {
		if (start == arr.length - 1) {
			return arr[start];
		}

		int elm = minElm(arr, start + 1);
		return Math.min(arr[start], elm);
	}
}
