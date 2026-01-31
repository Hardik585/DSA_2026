package lec_4;

public class Sum_Of_Digit {
	public static void main(String[] args) {
		int n = 2353;
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n =n/10;
		}
		System.out.println(sum);
	}
}
