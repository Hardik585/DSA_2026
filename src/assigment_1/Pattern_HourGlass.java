package assigment_1;

import java.util.Scanner;

public class Pattern_HourGlass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = n * 2 + 1;
		int space = 0;

		while (row <= n * 2 + 1) {

			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}

			int i = 1;
			int val = star/2;
			while (i <= star) {
				System.out.print(val+" ");
//				TODO Vertical Mirror 
				if (i < (star / 2) + 1) {
					val--;
				} else {
					val++;
				}
				i++;
			}
			
			//Horizontal Mirror 
			if(row < n+1) {
				star-=2;
				space++;
			}else{
				star+=2;
				space--;
			}
			row++;
			
			System.out.println();
		}
	}
}
