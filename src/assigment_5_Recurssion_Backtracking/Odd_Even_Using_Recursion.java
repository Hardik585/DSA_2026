package assigment_5_Recurssion_Backtracking;

import java.util.Scanner;

public class Odd_Even_Using_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		print(n);
	}

	public static void print(int n) {
		if (n == 0) {
			return;
		}

		if (n % 2 == 0) {
			print(n - 1);
			System.out.println(n);
		} else {
			System.out.println(n);
			print(n - 1);
		}
	}

}
