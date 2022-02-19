package com.syntax.class04;

public class NestedIfDiploma {

	public static void main(String[] args) {

		boolean diploma = true;
		
		if (diploma) {
			System.out.println("Congratulations");
			
			double gpa=3.5;
			
			if(gpa>=3.5) {
				System.out.println("You're eligible for scholarship");
			}else {
				System.out.println("You should've studied harder");
			}
		}else {
			System.out.println("I suggest to get a degree");
		}
	}
}