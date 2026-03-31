package assigment_4_2d_And_Binary;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int noS = sc.nextInt();
		int noC = sc.nextInt();
		int[] stalls = new int[noS];
		for(int i=0; i<noS; i++) {
			stalls[i]=sc.nextInt();
		}
		Arrays.sort(stalls);

		System.out.println(getMaxDistance(stalls, noC));

	}

	public static int getMaxDistance(int[] arr, int noC) {
		int ans = 0;
		int lo =1;
		int hi = arr[arr.length-1] - arr[0];		
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isItPossible(arr, mid, noC)) {
				ans = mid;
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		return ans;
	}

	public static boolean isItPossible(int[] arr, int mid, int noC) {
		int sitCow = 1 ,pos=arr[0];
		int i = 1;
		for (; i < arr.length;) {
			if (arr[i] - pos >= mid) {
				pos=arr[i];
				sitCow++;
			}
			i++;
		}
		return sitCow >= noC;
	}

}
