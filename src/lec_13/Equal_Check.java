package lec_13;

public class Equal_Check {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = new String("Hello");

		System.out.println(equals(s1, s2));

	}

	public static boolean equals(String str1, String str2) {
		if (str1 == str2) { // address same
			return true;
		}
		if (str1.length() != str2.length()) {
			return false;
		}

		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
}
