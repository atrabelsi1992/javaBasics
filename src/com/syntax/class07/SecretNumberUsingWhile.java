package com.syntax.class07;

import java.util.Scanner;

public class SecretNumberUsingWhile {

	public static void main(String[] args) {
		/*
		 * Create a secret number
		 * 
		 * We want the user to guess our secret number
		 * 
		 * The moment user guessed my secret number --> My program should stop otherwise
		 * it should continue asking to guess my number
		 */

		int secretNumber = 12;
		Scanner scan = new Scanner(System.in);
		int guessNumber;

		System.out.println("Please enter a number to win");
		guessNumber = scan.nextInt();

		while (guessNumber != secretNumber) {
			System.out.println("Please enter a number to win");
			guessNumber = scan.nextInt();
		}
		System.out.println("Congrtulations");
	}
}