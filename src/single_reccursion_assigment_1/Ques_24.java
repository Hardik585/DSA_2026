package single_reccursion_assigment_1;

import java.util.Scanner;

public class Ques_24 {
	public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n  = sc.nextInt();
			System.out.print(sumOfEven(n));
	}

	public static int sumOfEven(int n) {
		if (n == 0) {
			return 0;
		}
		 int sum = sumOfEven( n / 10 );
		int rem = n % 10;
		if(rem % 2 == 0) {
			sum += rem;
		}
		return sum;
	}
}
