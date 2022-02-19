package com.syntax.class04;

import java.util.Scanner;

public class WorkSalary {

	public static void main(String[] args) {

		Scanner user=new Scanner(System.in);
		System.out.println("Please enter number of worked years.");
		int years=user.nextInt();
		if (years>=5) {
			System.out.println("You are eligible for a bonus.");
			System.out.println("Please enter your salary amount.");
		int salary=user.nextInt();
		if (salary>=50000) {
			System.out.println("Congratulations, you get a $5,000 bonus.");
		}else {
			System.out.println("Congratulations, you get a $3,000 bonus." );
		}
		}
		else {
			System.out.println("We apologize, you're not eligable for a bonus at this time.");
		}
	}
}