package assigment_3;

import java.util.Scanner;

public class Help_Ramu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt();

		while (testCase > 0) {
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			int c3 = sc.nextInt();
			int c4 = sc.nextInt();
			int n = sc.nextInt();
			int m = sc.nextInt();

			// total no of rickshaw and cab
			int[] rick = new int[n];
			int[] cab = new int[m];

			// no of rides per rickshaw
			for (int i = 0; i < n; i++) {
				rick[i] = sc.nextInt();
			}

			// no of rides per cabs wise
			for (int i = 0; i < m; i++) {
				cab[i] = sc.nextInt();
			}
			System.out.println(helpRamu(c1, c2, c3, c4, rick, cab));

			testCase--;
		}
	}

	public static int helpRamu(int c1, int c2, int c3, int c4, int[] rick, int[] cab) {
		int cost_rickShaw = 0, cost_cab = 0;
		for (int i = 0; i < rick.length; i++) {
			cost_rickShaw += Math.min(rick[i] * c1, c2);
		}

		for (int i = 0; i < cab.length; i++) {
			cost_cab += Math.min(cab[i] * c1, c2);
		}
		cost_cab = Math.min(cost_cab, c3);
		cost_rickShaw = Math.min(cost_rickShaw, c3);
		return Math.min(c4, cost_cab + cost_rickShaw);
	}

}
