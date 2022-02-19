package com.syntax.class07;

public class Task1 {

	public static void main(String[] args) {
		// Print only even numbers from 1 to 30

		int num = 2;
		while (num <= 30) {
			System.out.println(num);
			num += 2;
		}
		System.out.println("Another way to print even numbers from 1 to 30");

		int num1 = 1;
		while (num1 <= 30) {
			if (num1 % 2 == 0) {
				System.out.println(num1+" ");
			}
			num1++;
		}
		System.out.println("End of the code");
	}
}