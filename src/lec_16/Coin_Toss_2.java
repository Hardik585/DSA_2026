package lec_16;

import java.util.Scanner;

public class Coin_Toss_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Toss(n, "");
	}

	public static void Toss(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}
		Toss(n - 1, ans + "T");
		if (!ans.endsWith("H")) {   // sir way-> ans.length()==0 || ans.charAt(ans.length()-1) !='H'
			Toss(n - 1, ans + "H");
		}
	}
}
