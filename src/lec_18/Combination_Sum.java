package lec_18;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum {
	
	public static void main(String[] args) {
		int[] candidates = {2,3,6,7};
		int target = 7;
		System.out.println(combinationSum(candidates, target));
	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ll_2D = new ArrayList();
		Combination(candidates, target, ll, 0, ll_2D);
		return ll_2D;
	}

	public static void Combination(int[] coin, int amount, List<Integer> ll, int idx, List<List<Integer>> list_2D) {
		if (amount == 0) {
//				System.out.println(ll);
			list_2D.add(new ArrayList<>(ll));
			return;
		}
		for (int i = idx; i < coin.length; i++) {
			if (amount >= coin[i]) {
				ll.add(coin[i]);
				Combination(coin, amount - coin[i], ll, i, list_2D);
				ll.remove(ll.size() - 1);
			}
		}
	}
}