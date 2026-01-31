package assigment_1;

import java.util.Scanner;

public class Hollow_Rhombus_Pattern {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int row = 1;
			int star = n;
			int space =n-1;
			
			while(row<=n) {
				int i=1;
				while(i<=space) {
					System.out.print(" ");
					i++;
				}
				int j=1;
				while(j<=star) {
					if(row ==1 || row ==n || j==1 || j==n) {
						System.out.print("*");		
					}else {
						System.out.print(" ");
					}
					j++;
				}
				row++;
				space--;
				System.out.println();
			}
		}
	}
}
