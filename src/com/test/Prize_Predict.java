package com.test;

public class Prize_Predict {

	public static void main(String[] args) {
		int n = 780;
		if (n >= 650 && n <= 785) {
			System.out.println("Kurkure");
		} else if (n >= 450 && n <= 569) {
			System.out.println("mac");
		} else if (n >= 250 && n <= 380) {
			System.out.println("cycle");
		} else if (n >= 50 && n <= 129) {
			System.out.println("bike");
		} else {
			System.out.println("Happy Birthday");
		}

	}
}
