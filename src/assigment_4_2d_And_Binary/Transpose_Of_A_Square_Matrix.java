package assigment_4_2d_And_Binary;

import java.util.Scanner;

public class Transpose_Of_A_Square_Matrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		transpose(arr);
		print(arr);
	}

	public static void transpose(int[][] arr) {
		int n = arr.length;
		for (int i = 0; i < arr.length; i++) {
			int k = arr.length - i - 1;
			for (int j = i + 1; j < arr.length; j++) {
				int temp = arr[i][j]; // [0][1]
				arr[i][j] = arr[j][i]; // [1][0]
				arr[j][i] = temp;
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
