package com.syntax.class02;

public class Classwork2 {

	public static void main(String[] args) {

		System.out.println("***Task 1***");
		double n1 = 2.2;
		double n2 = 4.4;

		double add = n1 + n2;
		double sub = n1 - n2;
		double mul = n1 * n2;
		double div = n1 / n2;

		System.out.println("The add of 2 numbers " + n1 + " and " + n2 + " is equal to " + add);
		System.out.println("The sub of 2 numbers " + n1 + " and " + n2 + " is equal to " + sub);
		System.out.println("The mul of 2 numbers " + n1 + " and " + n2 + " is equal to " + mul);
		System.out.println("The div of 2 numbers " + n1 + " and " + n2 + " is equal to " + div);

		System.out.println();

		System.out.println("***Task 2***");
		double num = 3.9;
		double square = num * num;
		System.out.println("The square of the number " + num + " is " + square);

		System.out.println();

		System.out.println("***Task 3***");
		int width = 5;
		int height = 8;
		int perimeter = width + height + width + height;
		int area = width * height;
		System.out.println("The perimeter of a rectangle with width " + width + " and height " + height
				+ " is equal to " + perimeter + " and the area is " + area);
	}
}