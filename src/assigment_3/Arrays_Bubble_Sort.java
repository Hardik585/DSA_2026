package assigment_3;

import java.util.Scanner;

public class Arrays_Bubble_Sort {
	public static void main(String args[]) {
		int[] arr = create();
		sort(arr);
		for (int elm : arr) {
			System.out.print(elm + " ");
		}
	}

	public static int[] create() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
