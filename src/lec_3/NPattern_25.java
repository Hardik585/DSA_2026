package lec_3;

public class NPattern_25 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int space = n - 1;
		int star = 1;
		int val=1;
		while (row <= n) {
			// space
			int i = 1;
			while (i <= space) {
				System.out.print("\t");
				i++;
			}
			// star
			int j = 1;
			while (j <= star) {
				System.out.print(val + "\t");
				j++;
				val++;
			}
			row++;
			star += 2;
			space--;
			System.out.println();
			
		}

	}
}
