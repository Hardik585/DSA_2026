package assigment_2;

import java.util.Scanner;

public class Replace_Them_All {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long no = sc.nextLong();
		long base = 1;
        long ans = 0;

		while (no > 0) {
			int rem = (int) (no % 10);
			if (rem == 0) {
				rem = 5;
			}
			ans += rem * base;
			base *= 10;
			no /= 10;
		}
		
		System.out.println(ans);
	}
}
