package lec_23;

import java.util.Stack;

public class Insert_Bottom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Stack<Integer> s =new Stack<>();
		 s.push(10);
		 s.push(20);
		 s.push(30);
		 s.push(40);
		 s.push(50);
		 
		 System.out.println(s);
		 
		 Insert(s, -7);
		 
		 System.out.println(s);
	}
	
	public static void Insert(Stack<Integer> st, int data) {
		if(st.isEmpty()) {
			st.push(data);
			return ;
		}
		int x = st.pop();
		Insert(st, data);
		st.push(x);
	}

}
