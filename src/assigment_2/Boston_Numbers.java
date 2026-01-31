package assigment_2;

import java.util.Scanner;

public class Boston_Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int primeFactorSum = 0, sum = 0;

		int i = 2 , temp = no;
		while (temp > 1) {
			if (temp % i == 0) {
				int factor = i;
				while(factor>0) {
					primeFactorSum += i%10;
					factor /= 10;
				}	
				temp /= i;
			} else {
				i++;
			}
		}
		 System.out.println(primeFactorSum);
		
		while (no > 0) {
			sum += no % 10;
			no /= 10;
		}
		System.out.println(sum);
		
		if(primeFactorSum == sum) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		// 539 45
		
	}
}
