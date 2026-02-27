package single_reccursion_assigment_1;

import java.util.Scanner;

public class Ques_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
               factorial(n, 1);
	}

	public static void factorial(int n, int ans) {
		if (n == 1) {
			System.out.println(ans);
			return;
		}
		ans *= n;
		factorial(n - 1, ans);
	}
}
