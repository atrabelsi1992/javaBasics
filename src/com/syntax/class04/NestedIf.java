package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {

		boolean vaccine = true;
		int dose = 2;

		if (vaccine) {
			System.out.println("How many doses do you have?");

			if (dose == 1) {
				System.out.println("You need another shot");
			} else {
				System.out.println("You are fully vaccinated");
			}
		}
		System.out.println("------------------------------- ");
		/*Declare a variable for allergy
		 * If you have allergy --> 
		 * 		If you have pollen allergy
		 * 		If you have peanut allergy
		 * 		If you have gluten allergy
		 * If no allergy --> You're lucky
		 */
		boolean allergy=false;
		
		if(allergy) {
			System.out.println("Let's check what allergies you have");
			String allergyType="pollen";
			
			if(allergyType.equals("pollen")) {
				System.out.println("Please stay home when trees are blooming. Take medication A.");
			}else if (allergyType.equals("peanut")) {
				System.out.println("Please don't eat food that contains nuts. Take medication B.");
			}else if (allergyType.equals("gluten")) {
				System.out.println("Please follow gluten free diet. Take medication C.");
			}else {
				System.out.println("I don't know which suggestion to give you.");
			}
		}else {
			System.out.println("You're lucky");
		}
		
	}
}