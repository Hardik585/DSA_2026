package single_reccursion_assigment_1;

import java.util.Scanner;

public class Ques_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(countEvenNo(arr, 0));
	}

		public static int countEvenNo(int[] arr, int start) {
			if (start == arr.length) {
				return 0;
			}
			int Occ = countEvenNo(arr, start + 1);
			if (arr[start] % 2 == 0) {
				return Occ + 1;
			}
			return Occ;
		}

}
