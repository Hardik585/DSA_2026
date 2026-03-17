package lec_19;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "nitin";
//		Partition(ques, "");

		List<String> ll = new ArrayList<>();
		List<List<String>> list_2D = new ArrayList<List<String>>();
		Partition(ques, ll, list_2D);
		System.out.println(list_2D);

	}

	public static void Partition(String ques, List<String> list, List<List<String>> list_2D) {
		if (ques.length() == 0) {
//			System.out.println(ans);
			list_2D.add(new ArrayList<>(list));
			return;
		}

		for (int i = 1; i <= ques.length(); i++) {
			String str = ques.substring(0, i);
			if (isPalindrome(str)) {
				list.add(str);
				Partition(ques.substring(i), list, list_2D);
				list.remove(list.size() - 1);
			}
		}
	}

	public static boolean isPalindrome(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
