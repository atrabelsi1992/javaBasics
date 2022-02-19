package com.syntax.class03;

public class IfElseBlock {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 500;
		// Which number is largest
		if (num1 > num2) {
			System.out.println(num1 + " is larger than " + num2);
		} else {
			System.out.println(num2 + " is larger than " + num1);
		}
		int temp = 45;
		// If temp is more than 45 __> I'm going for a walk
		// Otherwise --> I'm staying at home

		if (temp >= 45) {
			System.out.println("I'm going for a walk");
		} else {
			System.out.println("I'm staying at home");
		}
		/* I need a variable that stores a gender
		 * If gender is F --> please use front of train
		 * otherwise --> please use back of train
		 */
		
		char gender='f';
		if (gender=='m') {
		System.out.println("Please use front of the train");
	}else{
		System.out.println("Please use back of the train");
	}
	}
}