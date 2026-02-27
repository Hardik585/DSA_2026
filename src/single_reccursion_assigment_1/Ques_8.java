package single_reccursion_assigment_1;

import java.util.Scanner;

public class Ques_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		reverseNo(n, 0);
	}

	public static void reverseNo(int n, int revNo) {
		if (n == 0) {
			System.out.print(revNo);
			return;
		}
        revNo *=10;
		revNo += n % 10;
		reverseNo(n / 10, revNo);

	}
}
