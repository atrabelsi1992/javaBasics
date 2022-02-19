package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {

		String name="Ahmed";
		String lastName="Trabelsi";
		char grade='A';
		String city="Fairfax";
		String state="Virginia";
		String phoneNumber="703-772-1228";
		
		System.out.println("My name is "+name+" and my last name is "+lastName+".");
		System.out.println("I am an "+grade+" student.");
		System.out.println("I live in "+city+" and state "+state+".");
		System.out.println("And my phone number is "+phoneNumber+".");
		
		city="Orlando";
		state="Florida";
		phoneNumber="703-593-2948";
		grade='B';
		
		System.out.println("My name is "+name+" "+lastName+" and I moved to new city "+city+" and new state "+state+"."+" My new phone number is "+phoneNumber+".");
		
	}

}
