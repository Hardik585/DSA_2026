package single_reccursion_assigment_1;

import java.util.Scanner;

public class Ques_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(sumOfArrayElm(arr, size-1));
	}

	public static int sumOfArrayElm(int[] arr, int len) {
		if (len == 0) {
			return arr[len];
		}

		int elm = sumOfArrayElm(arr, len- 1);
		return elm + arr[len];
	}
}
