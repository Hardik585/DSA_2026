package assigment_4_2d_And_Binary;

import java.util.Scanner;

public class Find_Square_Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float n = sc.nextFloat();
		System.out.println((int) getSqRoot(n));
	}

	public static float getSqRoot(float n) {
		float si = 1, ei = n;
		while (si <= ei) {
			float mid = (si + ei) / 2;
//			System.out.prfloatln(mid);
			if ((int) mid * (int) mid == n) {
//				System.out.println(mid);
				return mid;
			} else if (mid * mid < n) {
				si = mid + 1;
			} else {
				ei = mid - 1;
			}
		}
		return ei;
	}

}
