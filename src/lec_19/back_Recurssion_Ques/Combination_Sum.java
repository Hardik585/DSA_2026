package lec_19.back_Recurssion_Ques;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates = { 2, 3, 6, 7 };
		int target = 7;
		List<Integer> ll = new ArrayList<Integer>();
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		Combination(candidates, ll,ans, target,0);
		System.out.println(ans);
	}

	public static void Combination(int[] candidates, List<Integer> ll,List<List<Integer>> ans, int curr, int idx) {
		if(curr == 0) {
			ans.add(new ArrayList<>(ll));
			return;
		}
		
		for (int i = idx; i < candidates.length && curr >= candidates[i] ; i++) {
			if(curr -candidates[i] >= 0) {
				curr =curr- candidates[i];
				ll.add(candidates[i]);
				Combination(candidates, ll,ans, curr, idx);
				ll.remove(ll.size()-1);
				curr +=candidates[i];
				idx+=1;
			}
		}

	}

}
