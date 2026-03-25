package assigment_4_2d_And_Binary;

import java.util.Scanner;

public class A_Boolean_Matrix {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] arr = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int[][] ans = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == 1) {
					makeOne(arr, i, i, ans);
				}
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void makeOne(int[][] arr, int i, int j, int[][] ans) {
		// making row values 1
		for (int r = 0; r < arr.length; r++) {
			ans[r][j] = 1;
		}
		// make col val 1
		for (int c = 0; c < arr[i].length; c++) {
			ans[i][c] = 1;
		}

	}
}
