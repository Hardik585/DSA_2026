package lec_13;

public class Lexicographical_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Kunal";
		String s2 = "Komal";

//	compareTo() library compare Lexicographical
		System.out.println(s1.compareTo(s2)); // +ve s1>s2 | -ve s1<s2 | 0 s1==s2 | 6

		String s3 = "ankit";
		String s4 = "ankith";
		System.out.println(s3.compareTo(s4)); // s3.length() - s4.length(); | -1
		
		System.out.println(myCompareTo(s3, s4));
	}

	// my compareTo() method
	public static int myCompareTo(String str1, String str2) {
		if (str1 == str2) { // address same
			return 0;
		}
		int n = Math.min(str1.length(), str2.length());
		for (int i = 0; i < n; i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				return str1.charAt(i) - str2.charAt(i);
			}
		}
		return str1.length() - str2.length();
	}

}
