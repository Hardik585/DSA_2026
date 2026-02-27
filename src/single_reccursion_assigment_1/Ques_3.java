package single_reccursion_assigment_1;

import java.util.Scanner;

public class Ques_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sumNo(n, 0);
	}

	public static void sumNo(int n, int sum) {
		if (n == 1) {
			sum += n;
			System.out.println(sum);
			return;
		}
		sum += n;
		sumNo(n - 1, sum);

	}

}
