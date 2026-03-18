package lec_19.back_Recurssion_Ques;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] candidates = {1,2,7,6,1,5};
      int target = 8;
      List<Integer> ll = new ArrayList<Integer>();
      List<List<Integer>> ans = new ArrayList<List<Integer>>();
      Combination(candidates, target, 0, ll,ans);
      System.out.println(ans);
	}

	public static void Combination(int[] arr, int curr, int idx, List<Integer> ll, List<List<Integer>> ans) {
		if (curr == 0) {

			if(!ans.contains(ll)) {
				ans.add(new ArrayList<Integer>(ll));
			}
			return;
		}
		for (int i = idx; i < arr.length; i++) {
			if ( curr - arr[i] >= 0) {
				curr -= arr[i];
				ll.add(arr[i]);
				Combination(arr, curr, i+1, ll, ans);
				ll.remove(ll.size() - 1);
				curr += arr[i];
				idx+=1;
			}
		}
	}

}
