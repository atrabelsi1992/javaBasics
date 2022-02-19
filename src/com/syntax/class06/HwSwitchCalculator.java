package com.syntax.class06;

import java.util.Scanner;

public class HwSwitchCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter first number");
		int num1 = input.nextInt();

		System.out.println("Which operator would you like to use(+, -, /, *");
		String operator = input.next();

		System.out.println("Please enter second number");
		int num2 = input.nextInt();

		int answer = 0;

		switch (operator) {
		case "+":
			answer = num1 + num2;
			break;
		case "-":
			answer = num1 - num2;
			break;
		case "/":
			answer = num1 / num2;
			break;
		case "*":
			answer = num1 * num2;
			break;
		}
		System.out.println(num1+operator+num2+"="+answer);
	}
}
