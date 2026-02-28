package single_reccursion_assigment_1;

import java.util.Scanner;

public class Ques_20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toLowerCase();
		System.out.print(vowelInStr(str));

	}

	public static int vowelInStr(String str) {
		if (str.length() == 0) {
			return 0;
		}
		int count = vowelInStr(str.substring(1));
		char ch = str.charAt(0);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return count + 1;
		}
		return count;
	}
}
