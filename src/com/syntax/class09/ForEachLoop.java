package com.syntax.class09;

public class ForEachLoop {

	public static void main(String[] args) {

		String[] cities = { "Washington DC", "Miami", "Los Angeles", "New York" };

		// If you have an array you can use for each loop to iterate/loop through the
		// entire array.

		for (String city : cities) {
			System.out.println(city);
		}
		System.out.println(" -------Numbers Examples------- ");

		int[] numbers = { 10, 20, 30, 40 };

		for (int num : numbers) {
			
			System.out.println(num);
	}
		System.out.println(" -------Grade Example------- ");
		
		char[] grades= {'A', 'B', 'C', 'D'};
		for(char grade:grades) {
			System.out.println(grade);
		}
		System.out.println(" -------Country Example------- ");
		String[] countries = {"USA", "Canada", "Morocco", "Tunisia"};
		for(String country:countries) {
			System.out.println(country);
		}
}
}