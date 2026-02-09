package lec_10_A;

import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_Cows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int nos = sc.nextInt();
			int noc = sc.nextInt();
			int[] stall = new int[nos];

			for (int i = 0; i < stall.length; i++) {
				stall[i] = sc.nextInt();
			}
			Arrays.sort(stall);
			System.out.println(largest_minimum(stall, noc));
			t--;
		}
	}

	public static int largest_minimum(int[] stall, int noc) {
		int low = 1;
		int hi = stall[stall.length - 1] - stall[0];
		int ans = 0;
		while (low <= hi) {
			int mid = (hi + low) / 2;
			if (isItPossible(stall, mid, noc)) {
				ans = mid;
				low = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		return ans;
	}

	public static boolean isItPossible(int[] stall, int mid, int noc) {
		boolean b = false;
		int cow = 1;
		int pos = stall[0]; // first cow position or last time cows kha placed h
		for (int i = 1; i < stall.length; i++) {
			if (stall[i] - pos >= mid) {
				pos = stall[i];
				cow++;
			}
			if (noc == cow) {
				return true;
			}

		}
		return b;

	}
}
