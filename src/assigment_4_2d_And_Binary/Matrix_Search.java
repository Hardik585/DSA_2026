package assigment_4_2d_And_Binary;

import java.util.Scanner;

public class Matrix_Search {

	// TODO Auto-generated method stub
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
		int elm = sc.nextInt();
		System.out.println(search(arr, m, n, elm));
	}

	public static int search(int[][] arr, int m, int n, int elm) {
		for (int i = 0; i < m; i++) {
			if (arr[i][0] > elm) {
				continue;
			}
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == elm) {
					return 1;
				}
			}
		}
		return 0;
	}
}
