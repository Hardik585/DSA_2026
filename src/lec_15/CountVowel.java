package lec_15;

public class CountVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "coding";
		System.out.println(count(str.toUpperCase(), 0, 0));
	}

	public static int count(String str, int i, int ans) {
		if (i == str.length()) {
			return ans;
		}
		char ch = str.charAt(i);
		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			ans = ans + 1;
		}
		return count(str, i + 1, ans);
	}

	public static int countSir(String str) {
		if (str.length() == 0) {
			return 0;
		}
		char ch = str.charAt(0);
		int c = 0;
		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			c = 1;
		}
		c = c + countSir(str.substring(1));
		return c;
	}

}
