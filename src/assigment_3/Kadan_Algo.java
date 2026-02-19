package assigment_3;

import java.util.Scanner;

public class Kadan_Algo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum =Integer.MIN_VALUE;
		int curr_sum = 0;
		int j=0, k=0;
		for(int i=0;i<n; i++) {
			curr_sum += arr[i];
			if(curr_sum > sum) {
				sum = Math.max(sum, curr_sum);
			    k=i;	
			}
			if(curr_sum <0) {
				curr_sum =0;
				j=i+1;
			}
		}
		System.out.println(sum);
		System.out.println("start : "+ j + " end : " + k);
	}
}
