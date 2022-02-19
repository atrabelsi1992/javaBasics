package com.syntax.class04;

import java.util.Scanner;

public class CityTemp {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		System.out.println("What is your city?");
		String city=input.next(); // To have two words or more enter .nextLine
		
		System.out.println("Please enter temperature");
		
		int temp=input.nextInt();
		int tempC=(temp-32)*5/9;
		
		System.out.println("The temperature in the city "+city+" is "+tempC);
		
	}
}