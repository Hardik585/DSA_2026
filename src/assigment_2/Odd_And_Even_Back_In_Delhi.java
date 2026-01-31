package assigment_2;

import java.util.Scanner;

public class Odd_And_Even_Back_In_Delhi {
	public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int step = sc.nextInt();
            
            while(step>0) {
            	int no = sc.nextInt();
            	int i=0 , oddSum =0;
            	
            	while(no<0) {
            		if(i%2 !=0) {
            			oddSum += no%10;
            		}
            		no/=10;
            		i++;
            	}
            	if(oddSum%3 ==  0 ) {
            		System.out.println("yes");
            	}else {
            		System.out.println("No");
            	}
            	step--;
            }
	}
}
