package single_reccursion_assigment_1;

import java.util.Scanner;

public class Ques_42 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(strContaineOnlydigit(str, 0));
	}

	public static boolean strContaineOnlydigit(String str, int idx) {
		if (idx == str.length()) {
			return true;
		}
		int n = str.charAt(idx);
		if (n < 47 || n > 58) {
			return false;
		}
		return strContaineOnlydigit(str, idx + 1);
	}
}
