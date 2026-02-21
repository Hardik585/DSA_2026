package lec_14;

import java.util.ArrayList;

public class Arrays_Sum_Of_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 4, 7 };
		int[] arr2 = { 3, 7, 9, 3, 4, 6 };

		sumOfTwoArray(arr, arr2);
	}

	public static void sumOfTwoArray(int[] arr, int[] arr2) {
		ArrayList<Integer> list = new ArrayList();
		int l1 = arr.length-1;
		int l2 = arr2.length-1;
		int carry = 0;
		while (l1 >= 0 && l2 >= 0) {
			int sum = arr[l1] + arr2[l2] + carry;
			int data = sum % 10;
			list.add(data);
			carry = sum / 10;
			l1--;
			l2--;
		}
		while(l1>=0) {
			int sum = arr[l1]+carry;
			int data = sum %10;
			list.add(data);
			carry = sum /10;
			l1--;
		}
		while(l2>=0) {
			int sum = arr[l2]+carry;
			int data = sum %10;
			list.add(data);
			carry = sum /10;
			l2--;
		}
		if(carry !=0) {
			list.add(carry);
		}
		for(int elm : list) {
			System.out.print(elm + " ");
		}
	}

}
