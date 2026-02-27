package single_reccursion_assigment_1;

import java.util.Scanner;

public class Ques_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		printElm(arr , 0 );
	}
	
	public static void printElm(int[] arr , int start) {
		if(start == arr.length) {
			return;
		}
		System.out.print(arr[start]+ " ");
		printElm(arr, start + 1);
	}

}
