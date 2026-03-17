package single_reccursion_assigment_1;

import java.util.Scanner;

public class Ques_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i=0;
        for(; i<n; ) {
        	arr[i] = sc.nextInt();
        	i++;
        }
        System.out.println(stricklyInc(arr, 0));
	}

	public static boolean stricklyInc(int[] arr, int idx) {
		if (idx == arr.length - 1) {
			return true;
		}
		if (arr[idx + 1] != arr[idx] + 1) {
			return false;
		}
		return stricklyInc(arr, idx + 1);
	}

}
