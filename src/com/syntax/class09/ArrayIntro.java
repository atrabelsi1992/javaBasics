package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {

		int num = 1;

		// Creating an array that holds 4 elements

		int[] numbers = new int[4];

		// Storing values/elements inside an array

		numbers[0] = 90;
		numbers[1] = 87;
		numbers[2] = 89;
		numbers[3] = 99;

		// I want to print 99

		System.out.println(numbers[3]); // Will print 99

		System.out.println(numbers[3] + numbers[0]); // Will print 189 (99+90

		// I want to create an array of countries

		System.out.println("---------I want to create an array of countries---------");
		String[] countries = new String[5];

		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "Afghanistan";
		countries[3] = "Moldova";
		countries[4] = "Morocco";
		// countries[5] = "Turkey";

		// System.out.println(countries[5]); There will be an error as we only
		// identified 5 elements not 6 elements
		System.out.println(countries[3] + " " + countries[4]); // MoldovaMorocco

		System.out.println("---------I want to create an array of names---------");

		String[] names = new String[5];

		names[1] = "Orsan";
		names[2] = "Gulnar";
		names[3] = "Zakirullah";

		System.out.println(names[1]); // Orsan
		System.out.println("Value in indez 0 is = " + names[0]); // Will showcase null as String value by default is
																	// "null"

		names[1] = "Daniyar";
		System.out.println(names[1]); // Reassigned to Daniyar.

		/*
		 * TASK Create an array to store 4 different prices Find an average of how much
		 * we spent
		 */

		double[] price = new double[4];
		 
		price[0]=1.99;
		price[1]=4.76;
		price[2]=18.54;
		price[3]=34.99;

		double average = (price[0]+price[1]+price[2]+price[3])/4;
		System.out.println("The average of how much we spent is "+"$"+average);
		
	}
}