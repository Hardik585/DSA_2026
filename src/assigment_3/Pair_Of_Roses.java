package assigment_3;

import java.util.Scanner;

public class Pair_Of_Roses {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		while (testCase > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			int money = sc.nextInt();
			findPair(arr, money);
			testCase--;
		}
	}

	public static void findPair(int[] arr, int money) {
		int diff = Integer.MAX_VALUE;
		int rose1 = 0, rose2 = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			int moneyLeft = money - arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] - moneyLeft == 0) {
					if (diff > Math.max(arr[i], arr[j]) - Math.min(arr[i], arr[j])) {
						rose1 = Math.min(arr[i], arr[j]);
						rose2 = Math.max(arr[i], arr[j]);
						diff = Math.max(arr[i], arr[j]) - Math.min(arr[i], arr[j]);
					}
				}
			}
		}
		System.out.println("Deepak should buy roses whose prices are " + rose1 + " and " + rose2 + ".");
	}
}
