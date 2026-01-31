package assigment_1;

import java.util.Scanner;

public class Pattern_InvertedHourGlass {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int row = 1;
			int star =1;
			int space = n*2 -1;
			while (row <= n * 2 + 1) {
			    int val=n;
			    int i=1;
			    while(i<=star) {
			    	System.out.print(val+"\s");
			    	val--;
			    	i++;
			    }
			    int j=1;
			    while(j<=space) {
			    	System.out.print("\s\s");
			    	j++;
			    }
			    int k=1;
			    if(row == n+1) {
			    	k=2;
			    	++val;
			    }
			    while(k<=star) {
			    	System.out.print(++val+"\s");
			    	k++;
			    }
			    
			    //mirror
			    if(row <=n) {
			    	star++;
			    	space-=2;
			    }else {
			    	star--;
			    	space+=2;
			    }
				row++;
				
				System.out.println();

			}
		}
	}
}
