package assigment_4_2d_And_Binary;

import java.util.Scanner;

public class Arrays_Wave_Print_Row_Wise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		
		int r = 0;
		while (r < m) {
			int c = 0;
			if (r % 2 != 0) {
				c = m - 1;
			}
			for (int j = 0; j < m; j++) {
				System.out.print(arr[r][c] + ", ");
				if (r % 2 != 0) {
					c--;
				} else {
					c++;
				}
			}
			r++;
		}
		System.out.println("END");
	}

}
