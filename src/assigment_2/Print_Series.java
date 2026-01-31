package assigment_2;

import java.util.Scanner;

public class Print_Series {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		int i= 1;
		while (no1 > 0) {
			int x = (3 * i) + 2;
			if (x % no2 != 0) {
				System.out.println(x);
				no1--;
			}
			i++;
		}
	}
}
