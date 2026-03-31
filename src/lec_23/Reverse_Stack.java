package lec_23;

import java.util.Stack;

public class Reverse_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> s = new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);

		System.out.println(s);

		reverse(s);

		System.out.println(s);
	}

	public static void reverse(Stack<Integer> s) {
		if (s.isEmpty()) {
			return;
		}
		int x = s.pop();
		reverse(s);
		Insert(s, x);
	}

	public static void Insert(Stack<Integer> st, int data) {
		if (st.isEmpty()) {
			st.push(data);
			return;
		}
		int x = st.pop();
		Insert(st, data);
		st.push(x);
	}

}
