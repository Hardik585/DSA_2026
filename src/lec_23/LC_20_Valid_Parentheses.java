package lec_23;

import java.util.Stack;

public class LC_20_Valid_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "()[]{}";
	}

	public static boolean isValid(String str) {
		Stack<Character> st = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				st.push(ch);
			} else {
				if (st.isEmpty()) {
					return false;
				} else if (ch == ']' && st.peek() != '[') {
					return false;
				} else if (ch == '}' && st.peek() != '{') {
					return false;
				} else if (ch == ')' && st.peek() != '(') {
					return false;
				}
				st.pop();

			}

		}
		return st.isEmpty();
	}
}
