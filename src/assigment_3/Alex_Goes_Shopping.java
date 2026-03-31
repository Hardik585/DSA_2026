package assigment_3;

import java.util.Scanner;

public class Alex_Goes_Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int tc = sc.nextInt();
		while (tc > 0) {
			int money = sc.nextInt();
			int claimQty = sc.nextInt();
			findAns(arr, money, claimQty);
			tc--;

		}
	}

	public static void findAns(int[] arr, int moneyHave, int claimQty) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= moneyHave) {
				int remainMoney = moneyHave;
				while (remainMoney > 0) {
					remainMoney -= arr[i];
					if (remainMoney == 0) {
						count++;
						break;
					}
				}
			}
			if (count == claimQty) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
