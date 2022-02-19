package com.syntax.class03;

public class IfElseifPosNeg {

	public static void main(String[] args) {

		/*
		 * Write a Java Program to check whether a number is positive or negative. 
		 */
		
		int num = 12;
		
		if (num > 0) {
			System.out.println("The number "+num+ " is positive");
		} else if (num < 0) {
			System.out.println("The number "+num+ " is negative");
		} else {
			System.out.println("The number "+num+" is zero");
		}
	}
}