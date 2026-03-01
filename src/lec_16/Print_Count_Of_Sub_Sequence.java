package lec_16;

import java.util.Scanner;

public class Print_Count_Of_Sub_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(printSub(str, ""));
	}

	public static int printSub(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return 1;
		}
		char ch = ques.charAt(0);
		int x = printSub(ques.substring(1), ans);
		int y = printSub(ques.substring(1), ans + ch);
		return x + y;
	}

}
