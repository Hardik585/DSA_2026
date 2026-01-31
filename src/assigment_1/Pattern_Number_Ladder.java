package assigment_1;

import java.util.Scanner;

public class Pattern_Number_Ladder {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int row = 1;
			int star = 1;
			int val = 1;
			while (row <= n) {
				int i = 1;
				while (i <= star) {
					System.out.print(val + "\t");
					val++;
					i++;
				}
				star++;
				row++;
				System.out.println();
			}
		}

	}
}
