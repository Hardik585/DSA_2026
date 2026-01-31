package assigment_2;

import java.util.Scanner;

public class Nth_Fibonacci {
	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int no = sc.nextInt();
         int n1 =0, n2=1;
         while( no>1 ) {
        	 int c = n1+n2;
        	 n1=n2;
        	 n2=c;
        	 no--;
         }
         System.out.println(n2);
	}
}
