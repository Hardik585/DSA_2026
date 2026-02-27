package single_reccursion_assigment_1;

import java.util.Scanner;

public class Ques_10 {
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
		int pow = sc.nextInt();
		System.out.print(powFun(n , pow ));
	}

	public static int powFun(int n, int pow) {
		if (pow == 0) {
			return 1;
		}
		int ans = powFun(n, pow - 1);
		return ans * n;
	}
}
