package assigment_4_2d_And_Binary;

import java.util.Scanner;

public class Arrays_Wave_Print_Column_Wise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] arr = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		print(arr, m, n);
	}

	public static void print(int[][] arr, int m, int n) {
		int minR = 0, minC = 0, maxR = m - 1, maxC = n - 1;
		int totalCount = n * m;
		int count = 0;
		while (count < totalCount) {
			for (int i = minR; i <= maxR && count < totalCount; i++) {
				System.out.print(arr[i][minC] + ", ");
				count++;
			}
			minC++;
			for (int i = maxR; i >= minR && count < totalCount; i--) {
				System.out.print(arr[i][minC] + ", ");
				count++;
			}
			minC++;
		}
		System.out.print("END");
	}
}
