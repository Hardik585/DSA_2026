package assigment_4_2d_And_Binary;

import java.util.Scanner;

public class Mummy_Motivational_Speech {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int[][] arr = new int[r][r];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < r; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(check_lower_triangular(arr));
	}

	public static boolean check_lower_triangular(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}

}
