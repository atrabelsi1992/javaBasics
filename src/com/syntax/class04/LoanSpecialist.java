package com.syntax.class04;

import java.util.Scanner;

public class LoanSpecialist {

	public static void main(String[] args) {

		Scanner user=new Scanner (System.in);
		System.out.println("What is the amount of loan needed?");
		
		int loanAmount=user.nextInt();
		
		if (loanAmount<=200000) {
			System.out.println("We will loan you "+loanAmount);
		}else {
			System.out.println("Unfortunately we can't loan you the "+loanAmount);
		}
	}
}