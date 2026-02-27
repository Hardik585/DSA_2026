package single_reccursion_assigment_1;

import java.util.Scanner;

public class Ques_1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
          printNo(n);
	}

	public static void printNo(int n) {
		if (n == 1) {
			System.out.print(n +" ");
			return;
		}
		printNo(n - 1);
		System.out.print(n + " ");
	}

}
