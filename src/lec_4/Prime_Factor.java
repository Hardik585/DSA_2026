package lec_4;

public class Prime_Factor {
	public static void main(String[] args) {
		int n = 378;
		int i = 2;
		while (n > 1) {
			if (n % i == 0) {
				System.out.print(i + " ");
				n /= i;
			} else {
				i++;
			}

		}
	}
}
