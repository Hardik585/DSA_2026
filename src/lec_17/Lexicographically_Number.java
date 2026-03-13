package lec_17;

import java.util.ArrayList;
import java.util.List;

public class Lexicographically_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		printLexico(0, 100, list);
		System.out.println(list);
	}

	public static void printLexico(int curr, int n, List<Integer> list) {
		if (curr > n) {
			return;
		}
		if (curr != 0) {
			list.add(curr);
		}
		int i = 0;
		if (curr == 0) {
			i = 1;
		}
		for (; i <= 9; i++) {
			printLexico(curr * 10 + i, n , list);
		}
	}

}
