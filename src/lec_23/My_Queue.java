package lec_23;

import java.util.Iterator;

// There is no  Queue class in Java, Its an Interface in Java.
public class My_Queue {

	private Object[] arr;
	private int front;
	private int size;

	public My_Queue() {
		this(5);
	}

	public My_Queue(int n) {
		arr = new Object[n];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == arr.length;
	}

	public int size() {
		return size;
	}

	// Used to Add element into queue
	public void enqueue(Object x) throws Exception {
		if (isFull()) {
			throw new Exception("Queue is Full ");
		}
		int idx = (front + size) % arr.length;
		arr[idx] = x;
		size++;
	}

	// used to delete element from the queue
	public Object dequeue() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is empty");
		}
		Object x = arr[front];
		front = (front + 1) % arr.length;
		size--;
		return x;

	}

	// view the first in element
	public Object getFront() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue khali ho gya h ");
		}
		Object x = arr[front];
		return x;
	}

	// display all the elm present inside the queue
	public void display() {
		for (int i = 0; i < size(); i++) {
			int idx = (front + i) % arr.length;
			System.out.println(arr[idx]);
		}
	}
}
