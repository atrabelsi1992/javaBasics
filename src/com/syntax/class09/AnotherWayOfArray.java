package com.syntax.class09;

public class AnotherWayOfArray {

	public static void main(String[] args) {

		// I want to create an array of colors

		String[] colors = { "blue", "pink", "yellow", "orange" }; //Declaring a variable and storing values right away 

		System.out.println("My favorite color is " + colors[2]); // To print yellow

		// Disadvantage

		String[] array; //Declaring
		array=new String[4]; // Initializing the size
		
		/*
		 * NOT possible to do declarations and initilization in 2 steps
		 * String[] arr;
		 * arr = {};
		 */
	}
}