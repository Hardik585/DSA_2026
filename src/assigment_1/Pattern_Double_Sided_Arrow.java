package assigment_1;

import java.util.Scanner;

public class Pattern_Double_Sided_Arrow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int space = n - 1;
		while (row <= n) {
			// space
			int i = 1;
			while (i <= space) {
				System.err.print("# ");
				i++;
			}

			//star
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}

			//mirror 
			if (row < n / 2 + 1) {
//				space--;
				star++;
			} else {
//				space++;
				star--;
			}	

			row++;
			System.out.println();
		}
	}
}
