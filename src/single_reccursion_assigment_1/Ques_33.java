package single_reccursion_assigment_1;

import java.util.Scanner;

public class Ques_33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(countWord(str));
	}

	public static int countWord(String str) {
		if (str.length() == 0) {
			return 0;
		}
		int spaceInd = str.indexOf(' ');
		int ans = countWord(str.substring(spaceInd));
		return ans + 1;
	}

}
