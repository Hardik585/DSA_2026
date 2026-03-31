package assigment_4_2d_And_Binary;

import java.util.Scanner;

public class MurthalParantha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int noP =10;
//		int[] ranks = {1, 2, 3, 4};
//		System.out.println(minTime(ranks, noP));

		Scanner sc = new Scanner(System.in);
		int noP = sc.nextInt();
		int noC = sc.nextInt();
		int[] ranks = new int[noC];
		for (int i = 0; i < noC; i++) {
			ranks[i] = sc.nextInt();
		}
		System.out.println(minTime(ranks, noP));

	}

	public static int minTime(int[] ranks, int noP) {
		int ans = 0;
		int lo = 0; // at least minimum time required
		int hi = (ranks[ranks.length - 1] * noP * (noP + 1)) / 2; // at max time. worst time if the lower rank make all
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isItPossible(ranks, mid, noP)) {
				ans = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return ans;
	}

	public static boolean isItPossible(int[] ranks, int maxTimeToEach, int noP) {
		int i = 0, n = ranks.length;
		int timeUsed = 0, Totalprantha = 0, pranthaPerCook = 1;
		while (i < n) {
			if (timeUsed + (pranthaPerCook * ranks[i]) <= maxTimeToEach) {
				timeUsed += pranthaPerCook * ranks[i];
				pranthaPerCook++;
				Totalprantha++;
			} else {
				timeUsed = 0;
				pranthaPerCook = 1;
				i++;
			}
			if (Totalprantha >= noP) {
				return true;
			}
		}
		return false;
	}

}
