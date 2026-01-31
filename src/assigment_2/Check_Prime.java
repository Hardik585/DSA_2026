package assigment_2;

import java.util.Scanner;

public class Check_Prime {
	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int no = sc.nextInt();
         int count =1;
         for(int i=2; i<no; i++) {
        	 if(no%i==0) {
        		 count++;
        		 break;
        	 }
         }
         if(count ==2) {
        	 System.out.println("Not Prime");
         }else {
        	 System.out.println("Prime ");
         }
	}
}
