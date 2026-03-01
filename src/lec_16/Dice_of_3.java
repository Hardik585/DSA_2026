package lec_16;

import java.util.Scanner;

public class Dice_of_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		path_Used_On_Board(n, "", 0, 3);
	}

	public static void path_Used_On_Board(int destination, String pathUsed, int current, int noOfDices) {
		if (current == destination) {
			System.out.println(pathUsed);
			return;
		}
		if (current > destination) {
			return;
		}
//		path_Used_On_Board(destination, pathUsed + "1", current + 1);
//		path_Used_On_Board(destination, pathUsed + "2", current + 2);
//		path_Used_On_Board(destination, pathUsed + "3", current + 3);
		for (int i = 1; i <= noOfDices; i++) {
			path_Used_On_Board(destination, pathUsed + i, current + i, noOfDices);
		}

	}

	public static void path_Used_On_Board_By_User_Define_Dice_Face(int destination, String pathUsed, int current,
			int[] facesOfDice) {
		if (current == destination) {
			System.out.println(pathUsed);
			return;
		}
		if (current > destination) {
			return;
		}
//		path_Used_On_Board(destination, pathUsed + "1", current + 1);
//		path_Used_On_Board(destination, pathUsed + "2", current + 2);
//		path_Used_On_Board(destination, pathUsed + "3", current + 3);
		for (int i = 1; i < facesOfDice.length; i++) {
			path_Used_On_Board_By_User_Define_Dice_Face(destination, pathUsed + facesOfDice[i],
					current + facesOfDice[i], facesOfDice);
		}

	}
}
