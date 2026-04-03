package assigment_5_Recurssion_Backtracking;

import java.util.Scanner;

public class Replace_All_0_With_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(replace(n, 0, 1));
	}

	public static int replace(int n, int ans, int i) {
		if (n == 0) {
			return ans;
		}
		int rem = n % 10;
		if (rem == 0) {
			rem = 5;
		}
		rem = rem * i;
		ans += rem;
		return replace(n/10, ans, i * 10);
	}
}
