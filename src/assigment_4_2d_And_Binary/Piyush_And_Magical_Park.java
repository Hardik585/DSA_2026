package assigment_4_2d_And_Binary;

import java.util.Scanner;

public class Piyush_And_Magical_Park {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int s = sc.nextInt();

		char[][] park = new char[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				park[i][j] = sc.next().charAt(0);
			}
		}
		getRemaingStrength(park, n, m, s, k);
	}

	public static void getRemaingStrength(char[][] park, int n, int m, int s, int k) {
		int r = 0;
		while (r < n) {
			int c = 0;
			while (c < m) {
				if (s > k) {
					if (park[r][c] == '.') {
						if (c == m - 1) {
							s = s - 2;
						} else {
							s = s - 3;
						}
					} else if (park[r][c] == '*') {
						if (c == n - 1) {
							s += 5;
						} else {
							s += 4;
						}
					} else if (park[r][c] == '#') {
						break;
					}
					c++;
				} else {
					System.out.println("No");
					return;
				}
			}
			r++;
		}

		if (s >= k) {
			System.out.println("Yes");
			System.out.println(s);
			return;
		}
		System.out.println("No");
	}

}