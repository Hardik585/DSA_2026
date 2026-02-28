package single_reccursion_assigment_1;

import java.util.Scanner;

public class Ques_40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toLowerCase();
		System.out.print(removeChar(str, 0));
	}

	public static String removeChar(String str, int idx) {
		if (idx == str.length()) {
			return "";
		}
		String newStr = removeChar(str, idx + 1);
		if (str.charAt(idx) != 'x') {
			newStr += str.charAt(idx);
		}
		return newStr;

	}
}
