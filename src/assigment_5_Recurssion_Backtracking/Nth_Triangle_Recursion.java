package assigment_5_Recurssion_Backtracking;

import java.util.Scanner;

public class Nth_Triangle_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		print(n, 0);

	}

	public static void print(int n, int ans) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}
		print(n - 1, ans + n);
	}

}
