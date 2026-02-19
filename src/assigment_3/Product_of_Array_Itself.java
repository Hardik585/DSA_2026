package assigment_3;

import java.util.Scanner;

public class Product_of_Array_Itself {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		// sufix
		long[] suffix = new long[n];
		suffix[0] = 1;
		for (int i = 1; i < n; i++) {
			suffix[i] = suffix[i - 1] * arr[i - 1];
		}
		// prefix
		long[] prefix = new long[n];
		prefix[arr.length - 1] = 1;
		for (int i = arr.length - 2; i >= 0; i--) {
			prefix[i] = prefix[i + 1] * arr[i + 1];
		}

		for (int i = 0; i < n; i++) {
			System.out.print(suffix[i] * prefix[i] + " ");
		}
	}
}
