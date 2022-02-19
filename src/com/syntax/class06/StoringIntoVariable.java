package com.syntax.class06;

import java.util.Scanner;

public class StoringIntoVariable {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		System.out.println("What score did you get on your quiz");
		int quiz=input.nextInt();
		System.out.println("What score did you get on your mid term");
		int midterm=input.nextInt();
		System.out.println("What score did you get on your final scores");
		int finalScores=input.nextInt();
		
		int score=(quiz+midterm+finalScores)/3;
		
		char grade;
		
		if (score>=90) {
			grade='A';
			
		}else if (score>=70 && score<=90) {
			grade='B';
			
		}else if (score>=50 && score<=70) {
			grade='C';
			
		}else {
			grade='F';
	}
		System.out.println("Your grade is "+grade);
		
		//If your grade is A or B --> You're a good student --> otherwise yuo should study harder
		
		if (grade=='A' || grade=='B') {
			System.out.println("You're a great student");
		}
}
}