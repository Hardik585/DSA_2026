package assigment_3;

import java.util.Scanner;

public class The_Watermelon_Split {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int weight = sc.nextInt();
		if ( weight == 2||weight % 2 != 0) {
			System.out.println("No");
			return;
		}
		System.out.println("Yes");

	}
}