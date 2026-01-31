package assigment_2;

import java.util.Scanner;

public class Print_Reverse {
	public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           long no= sc.nextLong();
           int reverseNo = 0;
           
           while(no>0) {
        	   reverseNo*=10;
        	   int rem = (int)(no%10);
        	   reverseNo+=rem;
        	   no/=10;
           }
           
           System.out.println(reverseNo);
	}
}
