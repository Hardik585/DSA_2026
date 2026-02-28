package single_reccursion_assigment_1;

import java.util.Scanner;

public class Ques_41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(sumOfAlternate(n, 1));
	}

	public static int sumOfAlternate(int n, int idx) {
		if (n / 10 == 0) {
			return n;
		}
		if (idx == 1) {
			idx = 0;
		} else {
			idx = 1;
		}
		int sum = sumOfAlternate(n / 10, idx);
		if (idx == 1) {
			sum += n % 10;
		}
		return sum;
	}
}
