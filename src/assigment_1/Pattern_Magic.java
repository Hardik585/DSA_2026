package assigment_1;

import java.util.Scanner;

public class Pattern_Magic {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int row = 1;
			int star = n;
			int space =-1;
			
			while(row <=n*2 -1) {
				int i=1;
				while(i<=star) {
					System.out.print("*\t");
					i++;
				}
				int j=1;
				while(j<=space) {
					System.out.print("\t");
					j++;
				}
				int k=1;
				if(row ==1 || row == n*2-1) {
					k=2;
				}
				while(k<=star) {
					System.out.print("*\t");
					k++;
				}
				
				//mirror 
				if(row<n) {
					space +=2;
					star--;
				}else {
					space-=2;
					star++;
				}
				row++;
				System.out.println();
			}
		}
		
	}
}
