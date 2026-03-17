package lec_19;

public class Count_Primes {
	public int countPrimes(int n) {
		int c = 0;
		for (int i = 2; i < n; i++) {
			if (isPrime(i)) {
				c++;
			}
		}
		return c;
	}

	public static boolean isPrime(int n) {
		int div = 2;
		while (div * div <= n) {
			if (n % div == 0) {
				return false;
			}
			div++;
		}
		return true;
	}

}