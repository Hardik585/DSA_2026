package assigment_3;

import java.util.Scanner;

public class Calculate_The_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int q = sc.nextInt(); // operation
		while (q-- > 0) {
			int x = sc.nextInt();
			arr = newArr(arr, x);
		}

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		System.out.println(sum % 1000000007);
	}

	public static int[] newArr(int[] arr, int x) {
		int[] temp = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int idx = i - x;
			if (idx < 0) {
				idx += arr.length;
			}
			temp[i] = arr[i] + arr[idx];
		}
		return temp;
	}

}
