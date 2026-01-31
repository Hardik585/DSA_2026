package assigment_2;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int no1 = sc.nextInt();
           int no2 = sc.nextInt();
           int min = Math.min(no1, no2);
           int gcd = 1 , i = 2;
           while(i <=min) {
        	   if(no1%i==0 && no2%i==0) {
        		   gcd=i;
        	   }
        	   i++;
           }
           
           System.out.println(gcd);
	}
}
