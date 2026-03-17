package assigment_4_2d_And_Binary;

import java.util.Scanner;

public class Print_Upper_Triangular_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int[][] arr = new int[r][r];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < r; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		makeUperPartZerO(arr);
		print(arr);

	}

	public static void makeUperPartZerO(int[][] arr) {
		int r = arr.length;
		for (int i = 1; i < r; i++) {
			for (int j = 0; j < i; j++) {
				arr[i][j] = 0;
			}
		}
	}

	public static void print(int[][] arr2) {
		int n = arr2.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}

}
