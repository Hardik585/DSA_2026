package lec_17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Generate_Paranthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		parenthesis(list, "", n, 0, 0);

		System.out.println(list);

	}

	public static void parenthesis(List<String> list, String ans, int n, int open, int close) {
		if (open == n && close == n) {
			list.add(ans);
			return;
		}

		if (open > n || close > open) {
			return;
		}
		parenthesis(list, ans + "(", n, open + 1, close);
		parenthesis(list, ans + ")", n, open, close + 1);

	}

}
