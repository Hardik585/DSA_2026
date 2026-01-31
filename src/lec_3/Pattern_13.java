package lec_3;

public class Pattern_13 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int star = 1;

		while (row <= 2 * n - 1) {

			int i = 1;
			while (i <= star) {
				System.out.print("*\s");
				i++;
			}

			// Mirror
			// Next Row preparation
			if (row < n) {
				star++;
			} else {
				star--;
			}
			row++;
			System.out.println();
		}
	}
}
