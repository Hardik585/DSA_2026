package lec_12;

public class Spiral_Print {
	public static void main(String[] args) {
		int[][] arr = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 } };
		print(arr);

	}

	public static void print(int[][] arr) {
		int minRow = 0;
		int minCol = 0;
		int maxRow = arr.length - 1;
		int maxCol = arr[0].length - 1;
         int count =0;
         int total = arr.length * arr[0].length;
		while (count < total) {
			for (int i = minCol; i <= maxCol && count < total; i++) {
				System.out.print(arr[minRow][i] + " ");
				count++;
			}
//			System.out.println();
			minRow++;
			for (int i = minRow; i <= maxRow && count < total; i++) {
				System.out.print(arr[i][maxCol] + " ");
				count++;
			}
//			System.out.println();
			maxCol--;
			for (int i = maxCol; i >= minCol && count < total; i--) {
				System.out.print(arr[maxRow][i] + " ");
				count++;
			}
			maxRow--;
			for (int i = maxRow; i >= minRow && count < total; i--) {
				System.out.print(arr[i][minCol] + " ");
				count++;
			}
			minCol++;
			
		}
	}
}
