package lec_14;

public class Freq_Array {

	public static void main(String[] args) {
		String str = "dsfghfjfghfgj";
		int[] freq = new int[26];
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			freq[ch - 'a' ]++;  // freq[ch -'a'] = freq[ch- 'a'] - 1;
		}

	}

}
