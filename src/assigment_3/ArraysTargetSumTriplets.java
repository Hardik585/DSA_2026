package assigment_3;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTargetSumTriplets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int target = sc.nextInt();
		Arrays.sort(arr);
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n-1; j++) {
				for(int k=j+1; k<n-2; k++) {
					if(arr[i] + arr[j] +arr[k] == target) {
						System.out.println(arr[i] +", " +arr[j] +" and " + arr[k]);
					}
				}
			}
		}
	}

}
