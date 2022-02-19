package com.syntax.class02;

public class NonPrimitiveType {

	public static void main(String[] args) {

		String name="Ahmed";
		String lastName="Trabelsi";
		long phoneNumber =7035932948l;
		String mobileNumber="703-593-2948";
		String num="123";
		int num1=123;
		
		String greeting="Hello Friends!";
		System.out.println(greeting);
		
		System.out.println(name);	
		System.out.println(lastName);
		System.out.println(name+" "+lastName);
		
		int age=25;
		// Create output - Ahmed is 25 years old.
		System.out.println(name+" is "+age+" years old");
		String address="760 Cresting Oak Cr";
		
		//Create output - I live on 760 Cresting Oak Cr
		System.out.println("I live on "+ address);
		
		String feeling="like";
		String food="Kabob";
		System.out.println("I "+feeling+" "+food);
		
		feeling="love";
		food="shrimp";
		System.out.println("I "+feeling+" "+food);
	}
}
