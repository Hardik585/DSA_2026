package assigment_2;

import java.util.Scanner;

public class Binary_To_Decimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       long n= sc.nextLong();
       int deciaml =0 , x=0;
       while(n>0) {
    	    int rem =(int) n%10;
    	    deciaml += rem *(int)Math.pow(2, x);
    	    x++;
    	    n/=10;
       }
       System.out.println(deciaml);
	}
}
