package lec_4;

import java.util.Scanner;

public class Pascal_Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 0;
		int star = 1;
		while (row < n) {
			int ncr=1;
			int i = 0;
			while (i < star) {
				System.out.print(ncr+"\s");
				ncr = ((row-i)*(ncr))/(i+1);
				i++;
			}
			star++;
			row++;
			System.out.println();
		}
	}
}
