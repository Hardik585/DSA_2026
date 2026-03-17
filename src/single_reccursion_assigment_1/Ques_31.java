package single_reccursion_assigment_1;

import java.util.Scanner;

public class Ques_31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(replaceChar_A_With_O(str, 0, ""));
	}

	public static String replaceChar_A_With_O(String str, int index, String newStr) {
		if (index == str.length()) {
			return newStr;
		}
		if (str.charAt(index) == 'a') {
			newStr += "o";
		} else {
			newStr += str.charAt(index);
		}
		return replaceChar_A_With_O(str, index + 1, newStr);

	}
}
