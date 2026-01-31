package assigment_1;

import java.util.Scanner;

public class Pattern_Triangle {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int row = 1;
			int star = 1;
			int space = n - 1;
			int val = 1;

			while (row <= n) {
				int i = 1;
				while (i <= space) {
					System.out.print("\t");
					i++;
				}
				int j = 1;
				int k = val;
				while (j <= star) {
					System.out.print(k + "\t");
					if (j <star/2 +1) {
						k++;
					} else {
						k--;
					}
					j++;
				}
				row++;
				star += 2;
				space--;
				val++;
				System.out.println();
			}
		}
	}
}
