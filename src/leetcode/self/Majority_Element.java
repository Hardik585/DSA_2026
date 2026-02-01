package leetcode.self;

public class Majority_Element {
	public static void main(String[] args) {
		int[] nums = { 6,5,5};
		System.out.println(majorityElement(nums));
	}

	public static int majorityElement(int[] nums) {
		int n = nums.length, count = 1, ans = nums[0];
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}
			}
			if (count >= n / 2 + 1) {
				ans = nums[i];
			}
		}
		return ans;
	}
}


//[8,8,7,7,7]
//6,5,5