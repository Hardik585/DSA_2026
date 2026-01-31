package assigment_1;

import java.util.Scanner;

public class Mirror_Star_Pattern {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int row = 1;
			int star = 1;
			int space = n / 2;

			while (row <= n) {
				int i = 1;
				while (i <= space) {
					System.out.print("\s\t");
					i++;
				}
				int j = 1;
				while (j <= star) {
					System.out.print("*\t");
					j++;
				}
				if(row <=n/2) {
					space--;
					star+=2;
				}else {
					space++;
					star-=2;
				}
				row++;
				
				System.out.println();
			}
		}
	}
}
