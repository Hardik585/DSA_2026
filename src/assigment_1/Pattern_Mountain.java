package assigment_1;

import java.util.Scanner;

//TODO Can it be done with two loop only 
public class Pattern_Mountain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int space = n + 1;
		while (row <= n) {
			int i = 1;
			while (i <= star) {
				System.out.print(i+"\t");
				i++;
			}
			int j = 1;
			while (j <= space) {
				System.out.print("\t");
				j++;
			}
			int val= star;
			int k = 1;
			if (row == n) {
				k = 2;
				val=star-1;
			}
			while (k <= star) {
				System.out.print(val+"\t");
				k++;
				val--;
			}
			space -= 2;
			star++;
			row++;
			System.out.println();
		}
	}
}
