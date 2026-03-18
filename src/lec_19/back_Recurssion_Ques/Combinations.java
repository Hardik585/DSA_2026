package lec_19.back_Recurssion_Ques;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1, k = 1;
		List<Integer> ll = new ArrayList<Integer>();
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		Combination(n, k, 1, ll, ans);
		System.out.println(ans);

	}

	public static void Combination(int n, int k, int idx, List<Integer> ll, List<List<Integer>> ans) {
		if (k == 0) {
			ans.addLast(new ArrayList<Integer>(ll));
			return;
		}
		for (int i = idx; i <= n; i++) {
			ll.add(i);
			Combination(n, k - 1, i + 1, ll, ans);
			ll.remove(ll.size() - 1);
			idx += 1;
		}

	}

}
