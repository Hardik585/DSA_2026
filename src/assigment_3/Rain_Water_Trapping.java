package assigment_3;

import java.util.Scanner;

public class Rain_Water_Trapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		//prefix
		int[] prefix = new int[n];
		prefix[0] = arr[0];
		for (int i = 1; i < n; i++) {
			prefix[i] = Math.max(prefix[i - 1], arr[i]);
		}

		// suffix
		int[] suffix = new int[n];
		suffix[n - 1] = arr[n-1];
		for (int i = n - 2; i >= 0; i--) {
			suffix[i] = Math.max(suffix[i + 1], arr[i]);
		}

		// Calculation
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += Math.min(suffix[i], prefix[i]) - arr[i];
		}

		System.out.println(sum);
	}

}


//12
//0  1  0  2  1  0  1  3  2  1  2  1
//0 -1 1 -1 1 2 1 -1 0 1 -1 -1 0