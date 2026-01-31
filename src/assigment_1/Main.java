package assigment_1;

import java.util.Scanner;

public class Main {
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
				System.out.print("# ");
				i++;
			}

			// star
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}

			// mirror
			if (row < n / 2) {
				space--;
				star++;
			} else if (row == n / 2 + 1) {
				space -= 2;
				star++;
			} else if (row == n / 2 + 2) {
				space += 2;
				star--;
			} else {
				space++;
				star--;
			}

			row++;
			System.out.println();
		}
	}
}
