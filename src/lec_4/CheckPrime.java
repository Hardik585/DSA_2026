package lec_4;

import java.util.Scanner;

public class CheckPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count++;	
				break;
			}
			
		}
		if(count>=1) {
			System.out.println("No is not Prime");
		}else {
			System.out.println("No is Prime");	
		}
		
	}
}
