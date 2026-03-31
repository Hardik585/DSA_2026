package assigment_4_2d_And_Binary;

import java.util.Scanner;

public class Book_Allocation_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//         int[] pages = {10, 20, 30, 40};
//         int noS =2;
//         System.out.println(minPage(pages, noS));
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc > 0) {
			int n = sc.nextInt(); // no of books
			int m = sc.nextInt(); // no of student
			int[] pages = new int[n];
			for (int i = 0; i < n; i++) {
				pages[i] = sc.nextInt();
			}
			System.out.println(minPage(pages, m));
			tc--;
		}
	}

	public static int minPage(int[] pages, int noS) {
		int lo = 1;
		int hi = 0;
		for (int elm : pages) {
			hi = hi + elm;
		}
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isItPossible(pages, mid, noS)) {
				ans = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return ans;
	}

	public static boolean isItPossible(int[] pages, int maxlimitToRead, int noS) {
		int n = pages.length;
		int student = 1;
		int readPages = 0;
		int i = 0;
		while (i < n) {
			if (readPages + pages[i] <= maxlimitToRead) {
				readPages += pages[i];
				i++;
			} else {
				readPages = 0;
				student++;
			}
			if (student > noS) {
				return false;
			}
		}
		return true;
	}

}
