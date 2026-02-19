package lec_12;

import java.util.Scanner;

public class _2D_Array_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
//		int[][] arr = new int[row][]; //it is right ? 
//		int[][] arr = new int[][col]; /// is it right ? 
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("===============");
		display(arr);

	}

	public static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print( arr[i][j] +"\t");
			}
			System.out.println();
		}
	}

}
