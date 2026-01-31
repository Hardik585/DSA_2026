package assigment_2;

import java.util.Scanner;

// TODO
public class Conversion_Fahrenheit_To_Celsius {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int minFar = sc.nextInt();
		int maxFar = sc.nextInt();
		int step = sc.nextInt();

		while (minFar <= maxFar) {
			int cel = ((minFar - 32) * 5 )/9;
			System.out.println(minFar + "\t" + cel);
			minFar += step;
		}
	}
}
