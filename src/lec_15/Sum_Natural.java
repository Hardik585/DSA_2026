package lec_15;

public class Sum_Natural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumNatural(10));
	}

	public static int sumNatural(int n) {
		if (n == 1) {
			return 1;
		}
		int res = sumNatural(n - 1);
		return res + n;
	}

}
