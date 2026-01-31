package assigment_1;

import java.util.Scanner;

public class Pattern_With_Zeros {
	public static void main(String[] args) {
           try (Scanner sc = new Scanner(System.in)) {
			int n =sc.nextInt();
			   int row =1;
			   int star =1;
			   
			   while(row<=n) {
				   int i=1;
				   while(i<=star) {
					   if(i==1 || i==row) {
						   System.out.print(row+"\s");	   
					   }else {
						   System.out.print(0+"\s");
					   }
					   i++;
				   }
				   row++;
				   star++;
				   System.out.println();
			   }
		   }
	}
}
