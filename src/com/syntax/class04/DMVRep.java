package com.syntax.class04;

import java.util.Scanner;

public class DMVRep {

	public static void main(String[] args) {

	Scanner data=new Scanner(System.in);	
		System.out.println("May I please have your age?");
		
		int age=data.nextInt();
		
		if (age>=18) {
			System.out.println("I will issue you a drivers license.");
		}else {
			System.out.println("I can suggest you get a learners permit.");
		}
	}
}