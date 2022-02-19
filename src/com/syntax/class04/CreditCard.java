package com.syntax.class04;

import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {

	Scanner card = new Scanner(System.in);
	
	System.out.println("Do you have a credit card?");
	String cc=card.next();
	
	if (cc.equalsIgnoreCase("yes")) {
	System.out.println("What is your credit card balance?");
		
	int balance=card.nextInt();
	if (balance> 1000) {
		System.out.println("Please pay off your credit card balance immediately.");
	}else {
		System.out.println("You can spend more on your credit card.");
		}
	}else {
	System.out.println("Would you like to apply for a credit card today?");
     }
   }
}