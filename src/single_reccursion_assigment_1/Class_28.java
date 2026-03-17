package single_reccursion_assigment_1;

import java.util.Scanner;

public class Class_28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(decimalToBinary(n));
	}

	public static int decimalToBinary(int n ) {
		if(n == 1) {
			return 1;
		}
		
		int prevNo = decimalToBinary( n/2);
		int ans = (prevNo*10) + (n%2);
		return ans;
	}
}
