package assigment_2;

import java.util.Scanner;

public class Is_Armstrong_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no1 = sc.nextInt();

		if (no1 == 0) {
			System.out.println(true);
		}

		int no1Copy = no1, base = 0;
		while (no1Copy > 0) {
			no1Copy /= 10;
			base++;
		}
		
		no1Copy = no1;
		int ans = 0;
		while (no1Copy > 0) {
			int rem = no1Copy % 10;
			ans += Math.pow(rem, base);
			no1Copy /= 10;
		}
		if (ans == no1) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
