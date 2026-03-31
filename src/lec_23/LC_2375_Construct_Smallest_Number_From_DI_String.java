package lec_23;

import java.util.Stack;

public class LC_2375_Construct_Smallest_Number_From_DI_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "IIIDIDDD";
		System.out.println(constructor(s));
	}

	public static String constructor(String str) {
		int[] arr = new int[str.length() + 1];
		Stack<Integer> s = new Stack<>();
		int c = 1;
		for (int i = 0; i <= str.length(); i++) {
			if (i == str.length() || str.charAt(i) == 'I') {
				arr[i] = c++;
				while (!s.isEmpty()) {
					arr[s.pop()] = c++;
				}
			} else {
				s.push(i);
			}
		}
		String ans ="";
		for(int elm : arr) {
			ans+=elm;
		}
		return ans;
	}

}
