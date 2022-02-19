package com.syntax.class05;

import java.util.Scanner;

public class HwHeighInInches {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your height in inches");
		int user = input.nextInt();
		if (user < 60) {
			System.out.println("You are short");
		} else if (user >= 60 && user <= 72) {
			System.out.println("You are medium");
		} else {
			System.out.println("You are tall");
		}
	}
}