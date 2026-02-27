package single_reccursion_assigment_1;

import java.util.Scanner;

public class Ques_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int key = sc.nextInt();
		System.out.println(countElmOccurence(arr, 0, key));
	}

	public static int countElmOccurence(int[] arr, int start, int key) {
		if (start == arr.length) {
			return 0;
		}

		int isOcc = countElmOccurence(arr, start + 1, key);
		if (arr[start] == key) {
			isOcc += 1;
		}
		return isOcc;
	}
}
