package lec_23;

import java.util.Stack;

public class Stack_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>(); // there is no parameterizes constructor in stack
											// default capacity of stack is 10
											// stack is build using Vector class.
											// increase capacity by double (10 * 2)
		s.push(20); // add the element into the stack
		s.push(29); // add the element into the stack
		s.push(59); // add the element into the stack
		System.out.println(s.size()); // show total no of element in the stack
		System.out.println(s.capacity()); // show capacity of stack
		System.out.println(s.isEmpty()); // true/false whether elm is present or not
		System.out.println(s.peek()); // return top most elm or the last elm which is add to it 
//		System.out.println(s.);
	}

}
