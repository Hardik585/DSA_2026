package single_reccursion_assigment_1;

import java.util.Scanner;

public class Ques_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int key = sc.nextInt();
		System.out.println(elmFirstOccurence(arr, 0, key));
	}

	public static int elmFirstOccurence(int[] arr, int start, int key) {
		if (start == arr.length) {
			return -1;
		}
		
		if (arr[start] == key) {
			return start;
		}
		return elmFirstOccurence(arr, start + 1, key);
		
	}

}
