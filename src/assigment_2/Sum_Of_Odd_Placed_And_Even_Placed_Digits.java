package assigment_2;

import java.util.Scanner;

public class Sum_Of_Odd_Placed_And_Even_Placed_Digits {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int oddSum=0, evenSum=0;

        int i=0;
        
        while(n>0) {
        	int rem =n%10;
        	if(i%2!=0) {
        		oddSum+=rem;
        	}else {
        		evenSum+=rem;
        	}
        	i++;
        	n/=10;
        }
        
        System.out.println(evenSum);
        System.out.println(oddSum);
        
	}
	
}
