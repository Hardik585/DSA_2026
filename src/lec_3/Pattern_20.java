package lec_3;

public class Pattern_20 {
	public static void main(String[] args) {
		int n = 7;
		int row = 1;
		int star = 1;
		int space = n / 2;
		int val=1;

		while (row <= n) {
			int i = 1;
			while (i <= space) {
				System.out.print("\s\s");
				i++;
			}
			int j = 1;
			while (j <= star) {
				if(j==1 || j==val) {
				System.out.print("*\s");
				}else {
					System.out.print("\s\s");
				}
//				System.out.print("*\s");
				j++;
			}

			// Mirror
			if (row < n / 2 + 1) {
				space--;
				star += 2;
				val+=2;
			} else {
				space++;
				star -= 2;
				val-=2;
			}

			// nextLine preparation
			row++;
			
			System.out.println();
		}
	}
}
