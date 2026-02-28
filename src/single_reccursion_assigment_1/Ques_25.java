package single_reccursion_assigment_1;

import java.util.Scanner;

public class Ques_25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(removeZero(n, 1));
	}

	public static int removeZero(int n, int base) {
		if (n == 0) {
			return 0;
		}
		if (n % 10 != 0) {
			base *= 10;
		}
		int prevRes = removeZero(n / 10, base);
		if (n % 10 != 0) {
			prevRes *= base;
			prevRes += n % 10;
		}
		return prevRes;
	}
}
