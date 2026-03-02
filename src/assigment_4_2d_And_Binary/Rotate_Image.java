package assigment_4_2d_And_Binary;

import java.util.Scanner;

public class Rotate_Image {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int[][] arr2 = rotate_90(arr);
		print(arr2);
	}

	public static int[][] rotate_90(int[][] arr) {
		int n = arr.length;
		int[][] newArr = new int[n][n];

		for (int i = 0; i < arr.length; i++) {
			int k = arr.length - i - 1;
			for (int j = 0; j < arr.length; j++) {
				newArr[i][j] = arr[j][k];
			}
		}
		return newArr;
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
