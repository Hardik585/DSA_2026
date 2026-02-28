package single_reccursion_assigment_1;

import java.util.Scanner;

public class Ques_37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		System.out.println(samllestDigit(no));
	}

	public static int samllestDigit(int n) {
		if (n / 10 == 0) {
			return n;
		}
		int prevDigit = samllestDigit(n / 10);
		return Math.min(n % 10 , prevDigit);
	}
}
