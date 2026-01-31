package assigment_2;

import java.util.Scanner;

public class Count_Digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int digit = sc.nextInt(), count = 0;
		while (n > 0) {
			int rem = (int) (n % 10);
			if (rem == digit) {
				count++;
			}
			n /= 10;
		}
		System.out.println(count);
	}
}
