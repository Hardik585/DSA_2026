package single_reccursion_assigment_1;

import java.util.Scanner;

public class Ques_26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(countZero(n));
	}

	public static int countZero(int n) {
		if (n == 0) {
			return 0;
		}
		int count = countZero(n / 10);
		if (n % 10 == 0) {
			count += 1;
		}
		return count;
	}
}
