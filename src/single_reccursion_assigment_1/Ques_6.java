package single_reccursion_assigment_1;

import java.util.Scanner;

public class Ques_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		countDigit(n, 0);
	}
	
	public static void countDigit(int n , int count) {
		if(n ==0) {
			 System.out.println(count);
			return ;
		}
		count+=1;
		countDigit(n/10, count);
		
	}
}
