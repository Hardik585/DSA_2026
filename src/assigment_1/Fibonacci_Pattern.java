package assigment_1;

import java.util.Scanner;

public class Fibonacci_Pattern {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int row = 1;
			int star =1;
			int no1=0;
			int no2=1;
			
			while(row <=n) {
				int i=1 ;
				while(i<=star) {
					System.out.print(no1 +"\t");
					int temp=no1;
					no1= no2;
					no2=temp+no2;
					i++;
				}
				
				row++;
				star++;
				System.out.println();
			}
		}
	}
}
