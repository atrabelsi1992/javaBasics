package com.syntax.class04;

import java.util.Scanner; // We need to import Scanner into our class

public class UserInput {

	public static void main(String[] args) {
		
		int num=10;
		num=20;
		
		Scanner input=new Scanner(System.in);// Creating a Scanner
		
		System.out.println("Please enter your name");
		
		//If you want to capture single String --> Use next ();
		
		String name=input.next(); // Type String and hit enter. nextline creates both names
		System.out.println("Your name is "+name);
		
		//If you want to capture int value --> use nextInt();
		
		System.out.println(name+" please enter your age");
		int age=input.nextInt(); //type integer and hit enter
		
		System.out.println("Your name is "+name+" and your age is "+age);
	}
}