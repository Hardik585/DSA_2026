package single_reccursion_assigment_1;

import java.util.Scanner;

public class Ques_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sumOfDigit(n, 0);
	}

	public static void sumOfDigit(int n, int sum) {
		if (n == 0) {
			System.out.println(sum);
			return;
		}
		sum += n % 10;
		sumOfDigit(n/10, sum);
	}

}
