package single_reccursion_assigment_1;

import java.util.Scanner;

public class Ques_34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int i = 0;
		for (; i < n;) {
			arr[i] = sc.nextInt();
			i++;
		}
		int key = sc.nextInt();
		printAllIndex(arr, key, 0);
	}

	public static void printAllIndex(int[] arr, int key, int idx) {
		if (idx == arr.length) {
			return;
		}
		if (arr[idx] == key) {
			System.out.println(idx);
		}
		printAllIndex(arr, key, idx + 1);
	}
}
