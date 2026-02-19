package lec_12;

public class LC_240_Search_In_2D_Matrix_ {
	public static void main(String[] args) {
		int[][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 5;   
		System.out.println(searchMatrix(arr , target));
	}

	public static  boolean searchMatrix(int[][] arr, int target) {
		int row = 0;
		int col = arr[0].length - 1;

		while (row < arr.length && col >= 0) {
			if (arr[row][col] == target) {
				return true;
			} else if (arr[row][col] > target) {
				col--;
			} else {
				row++;
			}
		}
		return false;
	}

}
