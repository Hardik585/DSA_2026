package lec_19.back_Recurssion_Ques;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "nitin";
		List<String> ll = new ArrayList<>();
		List<List<String>> _2D_list = new ArrayList<>();
		Partition(str, ll, _2D_list);
		System.out.println(_2D_list);
	}

	public static void Partition(String str, List<String> ll, List<List<String>> _2D_List) {
		if (str.length() == 0) {
            _2D_List.add(new ArrayList<String>(ll));
			return;
		}
		for (int i = 1; i <= str.length(); i++) {
			String s = str.substring(0, i);
			if (Is_Palindrome(s)) {
				ll.add(s);
				Partition(str.substring(i), ll, _2D_List);
				ll.remove(ll.size()-1);
			}
		}
	}

	public static boolean Is_Palindrome(String str) {
		int i = 0, j = str.length() - 1;
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
