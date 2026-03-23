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
		int rn = 0;
		for (int i = 0; i < arr.length && i < arr[rn].length; i++) {
			if (i == rn) {
				makeOne(arr, i, i);
			}
			rn++;
		}
	}

	public static void makeOne(int[][] arr, int i, int j) {
		// making row values 1
		for (int c = 0; c < arr[i].length; c++) {
			arr[i][c] = 1;
		}
		// make col val 1
		for (int r = 0; r < arr.length; r++) {
			arr[r][j] = 1;
		}
	}
}
