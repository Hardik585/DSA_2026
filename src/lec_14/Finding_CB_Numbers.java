package lec_14;

import java.util.Scanner;

public class Finding_CB_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc =new Scanner(System.in);
		 String str = sc.next();
          print(str);
	}

	public static void print(String str) {
		int count = 0;
		boolean[] visited = new boolean[str.length()];
		for (int len = 1; len <= str.length(); len++) {
			for (int j = len; j <= str.length(); j++) {
				int i = j - len;
				long num = Long.parseLong(str.substring(i, j));
				if (is_CB_No(num) && isVisited(visited, i, j - 1)) {
					count++;
					for (int k = i; k <= j - 1; k++) { // marked them as visited
						visited[k] = true;
					}
				}
			}
		}
		System.out.println(count);
	}

	public static boolean isVisited(boolean[] visited, int start, int end) {
		for (int i = start; i <= end; i++) {
			if (visited[i] == true) {
				return false;
			}
		}
		return true;
	}

	public static boolean is_CB_No(long num) {
		if (num == 0 || num == 1) {
			return false;
		}
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };

		for (int elm : arr) {
			if (elm == num) {
				return true;
			}
		}
		for (int elm : arr) {
			if (num % elm == 0) {
				return false;
			}
		}
		return true;
	}
}
