package lec_19;

import java.util.Scanner;

public class Rat_Chases_Its_Cheese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] maze = new char[n][m];

		for (int i = 0; i < n; i++) {
			String str = sc.next();
			for (int j = 0; j < str.length(); j++) {
				maze[i][j] = str.charAt(j);
			}
		}

		int[][] ans = new int[n][m];

		printMaze(maze, 0, 0, ans);
		
		System.out.println("=========================");
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[i].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
			if(ans[ans.length-1][ans[0].length-1] == 0) {
				System.out.println("NO PATH FOUND");
			}
		}
	}

	public static void printMaze(char[][] maze, int cr, int cc, int[][] ans) {
		if (cr < 0 || cc < 0 || cr >= maze.length || cc >= maze[0].length || maze[cr][cc] == 'X') {
			return;
		}
		if (cr == maze.length - 1 && cc == maze[0].length - 1) {
			ans[cr][cc]=1;
			Display(ans);
			return;
		}
		maze[cr][cc] = 'X';
		ans[cr][cc] = 1;
		printMaze(maze, cr - 1, cc, ans); // up
		printMaze(maze, cr + 1, cc, ans); // down
		printMaze(maze, cr, cc + 1, ans); // right
		printMaze(maze, cr, cc - 1, ans); // left
		maze[cr][cc] = 'O';
		ans[cr][cc] = 0;
	}

	public static void Display(int[][] ans) {
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[i].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}

}
