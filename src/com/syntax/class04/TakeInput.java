package com.syntax.class04;
/*
 * To import: ctrl+shift+o
 */

import java.util.Scanner;

public class TakeInput {
	public static void main(String[] args) {

		// 1. Create a Scanner and assign to a variable
		Scanner scan = new Scanner(System.in);

		// 2. Specify instructions
		System.out.println("Please enter the country of where your from");

		// 3. We need to capture String value --> use next();
		String country = scan.next();
		System.out.println("You're from "+country);

		// If you're from USA --> Then you speak English
		// If you're from France --> Then you speak French

		if (country.equalsIgnoreCase("USA")) {
			System.out.println("You speak english");

		} else if (country.equalsIgnoreCase("France")) {
			System.out.println("You speak french");

		} else if (country.equalsIgnoreCase("Turkey")) {
			System.out.println("You speak turkish");

		} else {
			System.out.println("I don't know which language you speak");
		}
	}
}