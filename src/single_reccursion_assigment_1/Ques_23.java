package single_reccursion_assigment_1;

import java.util.Scanner;

public class Ques_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.print(lcm());

	}

	public static int lcm(int n1, int n2, int i, int j) {
		if (i == n1 || j == n2) {
			return n1 * i;
		}
		if (n1 * i > n2 * j) {
			j++;
		} else if (n1 * i < n2 * j) {
			i++;
		} else {
			return n1 * i; // we can return this n2*j;
		}
		return lcm(n1, n2, i, j);
	}

}
