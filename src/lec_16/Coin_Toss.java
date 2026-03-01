package lec_16;

import java.util.Scanner;

public class Coin_Toss {

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
		Toss(n - 1, ans + "H");
	}

}
