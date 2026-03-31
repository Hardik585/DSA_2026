package assigment_4_2d_And_Binary;

import java.util.Scanner;

public class KTH_ROOT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc > 0) {
			long n = sc.nextLong();
			int k = sc.nextInt();
			System.out.println(greate_Lesser(n, k));
			tc--;
		}
	}

	public static long greate_Lesser(long n, int k) {
		long lo = 1;
		long hi = n;
		long ans = 0;
		while (lo <= hi) {
			long mid = (lo + (hi - lo) / 2);
			if (Math.pow(mid, k) <= n) {
				ans = mid;
				lo = mid + 1;

			} else {
				hi = mid - 1;
			}
		}

		return ans;
	}

}
