package lec_20;

public class N_Queen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean[][] board = new boolean[n][n];
		int tq = 4;
		Print(board, tq, 0);
	}

	public static void Print(boolean[][] board, int tq, int row) {
		if (tq == 0) {
			Display(board);
			System.out.println();
			return;
		}
		for (int col = 0; col < board[0].length; col++) {
			if (isItsafe(board, row, col)) {
				board[row][col] = true;
				Print(board, tq - 1, row + 1);
				board[row][col] = false;
			}
		}
	}

	private static boolean isItsafe(boolean[][] board, int row, int col) {
		// TODO Auto-generated method stub
		// right diagonal
		int r = row;
		int c = col;
		while (r >= 0 && c < board.length) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c++;
		}

		// left diagonal
		r = row;
		c = col;
		while (r >= 0 && c >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c--;
		}

		// Up diagonal
		r = row;
		while (r >= 0) {
			if (board[r][col]) {
				return false;
			}
			r--;
		}
		return true;
	}

	private static void Display(boolean[][] board) {
		// TODO Auto-generated method stub
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {
				System.out.print(board[row][col] + "\t");
			}
			System.out.println();
		}
	}

}
