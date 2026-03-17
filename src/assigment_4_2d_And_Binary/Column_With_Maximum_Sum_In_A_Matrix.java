package assigment_4_2d_And_Binary;

import java.util.Scanner;

public class Column_With_Maximum_Sum_In_A_Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		maxSum(arr);

	}

	public static void maxSum(int[][] arr) {
		int ans = 0, index = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = 0; j < n; j++) {
				sum += arr[j][i];
			}
			if (ans < sum) {
				ans = sum;
				index = i + 1;
			}

		}
		System.out.println(index + " " + ans);
	}

}
