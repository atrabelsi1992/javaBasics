package com.syntax.class04;

public class Donor {

	public static void main(String[] args) {

		int age = 18;
		int weight = 106;

		if (age >= 18) {
			System.out.println("You're able to donate blood");
			if (weight >= 110) {
				System.out.println("You're eligable to donate blood");
			} else {
				System.out.println("You're not eligable to donate blood");
			}
		} else {
			System.out.println("You're not able to donate blood");
	}
	}
}