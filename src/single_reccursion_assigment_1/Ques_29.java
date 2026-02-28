package single_reccursion_assigment_1;

import java.util.Scanner;

public class Ques_29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(isPalindrom(str, 0, str.length() - 1));
	}

	public static boolean isPalindrom(String str, int start, int last) {
		if (start == last) {
			return true;
		}
		if (str.charAt(start) != str.charAt(last)) {
			return false;
		}
		return isPalindrom(str, start + 1, last - 1);
	}
}
