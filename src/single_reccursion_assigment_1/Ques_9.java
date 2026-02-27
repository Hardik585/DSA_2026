package single_reccursion_assigment_1;

import java.util.Scanner;

public class Ques_9 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		System.out.println(chekPalindrom(n));
	}

	public static boolean chekPalindrom(int n) {
		return n == reverseNo(n, 0);
	}

	public static int reverseNo(int n, int revNo) {
		if (n == 0) {
			return revNo;
		}
		revNo *= 10;
		revNo += n % 10;
		return reverseNo(n / 10, revNo);

	}
}













//public static boolean isPalindrome(int x) {
//
//    // Negative numbers are not palindrome
//    if (x < 0 || (x % 10 == 0 && x != 0))
//        return false;
//
//    int reversedHalf = 0;
//
//    while (x > reversedHalf) {
//        reversedHalf = reversedHalf * 10 + x % 10;
//        x = x / 10;
//    }
//
//    // For even digits: x == reversedHalf
//    // For odd digits:  x == reversedHalf / 10
//
//    return (x == reversedHalf) || (x == reversedHalf / 10);
//}

