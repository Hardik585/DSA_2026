package assigment_3;

import java.util.Scanner;

public class Pair_Of_Roses {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();

		while (testCase > 0) {
			int[] arr = createArr(sc);

			int moneyHave = sc.nextInt();
			findPairs(arr, moneyHave);
			testCase--;
		}
	}

	public static int[] createArr(Scanner sc) {
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int a = 0; a < size; a++) {
			arr[a] = sc.nextInt();
		}
		return arr;
	}

	public static void findPairs(int[] arr, int moneyHave) {
		int i = 0, j = 0, minDiff = Integer.MIN_VALUE;
		for (int a = 0; a < arr.length - 1; a++) {
			int rem = moneyHave - arr[a];
			if (rem > 0) {
				for (int b = a + 1; b < arr.length; b++) {
					if (rem - arr[b] == 0) {
						int currDiff = Math.max(arr[a], arr[b]) - Math.min(arr[a], arr[b]);
						if (currDiff < minDiff) {
							i = arr[a];
							j = arr[b];
							minDiff = currDiff;
						}
					}
				}
			}
		}
		System.out.println(i + " " + j);
	}
}
