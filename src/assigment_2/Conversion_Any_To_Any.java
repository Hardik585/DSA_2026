package assigment_2;

import java.util.Scanner;

public class Conversion_Any_To_Any {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sb = sc.nextInt();
		int db = sc.nextInt();
		int no = sc.nextInt();

		int decimal = 0, base = 1;

		while (no > 0) {
			int rem = no % 10;
			decimal += rem * base;
			base *= sb;
			no /= 10;
		}

		int ans = 0;
		base = 1;
		while (decimal > 0) {
			int rem = decimal % db;
			ans += rem * base;
			base *= 10;
			decimal /= db;
		}
           System.out.println(ans);
	}
}
