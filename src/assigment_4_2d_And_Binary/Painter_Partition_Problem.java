package assigment_4_2d_And_Binary;

import java.util.Scanner;

public class Painter_Partition_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int noP = 2;
//		int[] board = { 1, 10 };
//		System.out.println(minTime(board, noP));

		Scanner sc = new Scanner(System.in);
		int noP = sc.nextInt();
		int noB = sc.nextInt();
		int[] board = new int[noB];
		for (int i = 0; i < noB; i++) {
			board[i] = sc.nextInt();
		}
		System.out.println(minTime(board, noP));
	}

	public static int minTime(int[] board, int noP) {
		int ans = 0;
		int lo = 0, hi = 0;
		for (int i = 0; i < board.length; i++) {
			hi += board[i];
		}
		int totalRequired = hi;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isItPossible(board, mid, noP, totalRequired)) {
				ans = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return ans;
	}

	public static boolean isItPossible(int[] board, int mid, int noP, int totalRequired) {
		int unitPaint = 0, i = 0, n = board.length, noPUsed = 1;
		for (; i < n;) {
			if (unitPaint + board[i] <= mid) {
				unitPaint += board[i];
				i++;
			} else {
				unitPaint = 0;
				noPUsed++;
			}
			if (noPUsed > noP) {
				return false;
			}
		}
		return true;
	}

}
