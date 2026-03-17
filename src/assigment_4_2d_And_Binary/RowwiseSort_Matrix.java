package assigment_4_2d_And_Binary;

import java.util.Scanner;

public class RowwiseSort_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] arr = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		rowWise(arr);

	}

	public static void rowWise(int[][] arr) {
		int row = arr.length;
		for (int i = 0; i < row; i++) {
			sort(arr[i]);
		}
	}

	public static void sort(int[] arr) {
		int col = arr.length;
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < col -i- 1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int elm : arr) {
			System.out.print(elm + " ");
		}
		System.out.println();
	}

}
