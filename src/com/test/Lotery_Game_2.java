package com.test;

public class Lotery_Game_2 {

	public static void main(String[] args) {
		int n = 780;
		if (n >= 650 && n <= 785) {
			System.out.println("Kurkure");
			if (n > 701) {
				System.out.println("Chat pate");
			} else {
				System.out.println("Garam Masale");
			}
		} else if (n >= 450 && n <= 569) {
			System.out.println("mac");
			if (n > 491) {
				System.out.println("m3 mac");
			} else {
				System.out.println("mini mac");
			}
		} else if (n >= 250 && n <= 380) {
			System.out.println("cycle");
			if (n > 311) {
				System.out.println("Hreo");
			} else {
				System.out.println("Atlas");
			}
		} else if (n >= 50 && n <= 129) {
			System.out.println("bike");
			if (n > 112) {
				System.out.println("Ktm");
			} else {
				System.out.println("Hero");
			}
		} else {
			System.out.println("Happy Birthday");
		}

	}
}