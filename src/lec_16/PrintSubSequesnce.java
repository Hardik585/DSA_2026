package lec_16;

import java.util.Scanner;

public class PrintSubSequesnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		printSub(str, "");
	}

	public static void printSub(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		printSub(ques.substring(1), ans);
		printSub(ques.substring(1), ans + ch);
	}

}
