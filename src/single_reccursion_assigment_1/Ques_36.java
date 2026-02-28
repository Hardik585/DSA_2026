package single_reccursion_assigment_1;

import java.util.Scanner;

public class Ques_36 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int i = 0;
		for (; i < n;) {
			arr[i] = sc.nextInt();
			i++;
		}
		printArrRev(arr, n-1);
	}
	
	public static void printArrRev(int[] arr , int lastIdx) {
		if(lastIdx == -1) {
			return;
		}
		System.out.print(arr[lastIdx] + " ");
		printArrRev(arr, lastIdx-1);
	}
}
