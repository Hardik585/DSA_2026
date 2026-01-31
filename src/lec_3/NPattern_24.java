package lec_3;

public class NPattern_24 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int space = n - 1;
		int star = 1;
		while (row <= n) {
			// space
			int i = 1;
			while (i <= space) {
				System.out.print("\s\s");
				i++;
			}
			// star
			int j = 1;
			while (j <= star) {
				System.out.print(row + "\s");
				j++;
			}
			row++;
			star += 2;
			space--;
			System.out.println();
			
		}

	}
}
