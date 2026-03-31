package lec_23;

public class Stack_Client {

	public static void main(String[] args) {
		My_Stack myStack = new My_Stack();

		try {
			myStack.push(10);
			myStack.push(20);
			myStack.push(33);
			myStack.push(44);
			myStack.push(55);
			myStack.display();
//			myStack.push(66);
//			myStack.push(77);
			
			System.out.println("==========================");
			
			System.out.println(myStack.pop());
			System.out.println(myStack.pop());
			System.out.println(myStack.pop());
			System.out.println(myStack.pop());
			System.out.println(myStack.pop());
			
//			System.out.println(myStack.pop());
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

	}

}
