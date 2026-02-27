package single_reccursion_assigment_1;

import java.util.Scanner;

public class Ques_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int key = sc.nextInt();
		System.out.println(elmLastOccurence(arr, arr.length - 1, key));
	}

	// backward
	public static int elmLastOccurence(int[] arr, int ind, int key) {
		if (ind == -1) {
			return ind;
		}

		if (arr[ind] == key) {
			return ind;
		}
		return elmLastOccurence(arr, ind - 1, key);

	}

	// forward
	public static int lastByForward(int[] arr, int start, int key) {
		if (start == arr.length) {
			return -1;
		}
		int lastIdx = lastByForward(arr, start + 1, key);
		if (lastIdx != -1) {
			return lastIdx;
		}
		if (arr[start] == key) {
			return start;
		}
		return -1;
	}

}
