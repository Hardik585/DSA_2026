package com.test;

public class Grade_Cal {
	public static void main(String[] args) {
		int marks = 54;

		if (marks >= 75) {
			System.out.println("A");
		} else if (marks >= 65 ) {
			System.out.println("B");
		} else if (marks > 55 ) {
			System.out.println("C");
		} else if (marks >= 45 ) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	}
}
