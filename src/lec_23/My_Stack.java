package lec_23;

public class My_Stack {

	private Object[] arr;
	private int idx = -1;

	public My_Stack() {
		this(5);
	}

	public My_Stack(int n) {
		arr = new Object[n];
	}

	// checking whether stack is empty or not
	public boolean isEmpty() {
		return idx == -1;
	}

	// checking whether is full or not
	public boolean isFull() {
		return idx == arr.length - 1;
	}

	// add elm to the stack
	public void push(int val) throws Exception {
		if (isFull()) {
			throw new Exception("stack full hogya");
		}
		arr[++idx] = val;
	}

	// just return the top most element or the last element which is add to the
	// stack
	public Object peek() {
		return arr[idx];
	}

	public Object pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("stack khali hogya");
		}
		return arr[idx--];
	}

	// print the arr elm
	public void display() {
		for (Object elm : arr) {
			System.out.println(elm);
		}
	}

	// print the size of the array
	public int size() {
		return idx + 1;
	}
}
