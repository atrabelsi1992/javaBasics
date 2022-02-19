package com.syntax.class04;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {

		Scanner number = new Scanner(System.in);
		System.out.println("What is the first value?");
		int first = number.nextInt();
		System.out.println("What is the second value?");
		int second = number.nextInt();
		System.out.println("What is the third value?");
		int third = number.nextInt();
		
		if (first > second) {
			
			if (first > third)
				System.out.println("The largest nuymber is " + first);
		} else if (third > second) {
			if (third > first) {
				System.out.println("The largest number is " + third);
			}
		} else if (second > first) {
			if (second > third) {
				System.out.println("The largest number is " + second);
			}
		}
	}
}