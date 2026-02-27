package single_reccursion_assigment_1;

import java.util.Scanner;

public class Ques_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		productOfDigit(n, 1);

	}

	public static void productOfDigit(int n, int product) {
		if(n == 0 && product ==1 ) {
			System.out.print(0);
			return ;
		}	
		if (n == 0) {
			System.out.println(product);
			return ;
		}
		product *= n % 10;
		productOfDigit(n / 10, product);
	}
}
