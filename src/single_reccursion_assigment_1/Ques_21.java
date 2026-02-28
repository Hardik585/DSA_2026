package single_reccursion_assigment_1;

import java.util.Scanner;

public class Ques_21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(isPrime(n, 2));
	}

	public static boolean isPrime(int n, int i) {
		if (n <= 1) {
			return false;
		}
		if (i == n) {    // i * i > n reduce O(n) to O(root n )
			return true;
		}
		if (n % i == 0) {
			return false;
		}
		return isPrime(n, i + 1);
	}
}
