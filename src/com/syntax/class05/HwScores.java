package com.syntax.class05;

import java.util.Scanner;

public class HwScores {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("What score did you get on your quiz");
		int quiz=input.nextInt();
		System.out.println("What score did you get on your mid term");
		int midterm=input.nextInt();
		System.out.println("What score did you get on your final scores");
		int finalScores=input.nextInt();
		
		int grade=(quiz+midterm+finalScores)/3;
		
		if (grade>=90) {
			System.out.println("Your grade is an A");
		}else if (grade>=70 && grade<=90) {
			System.out.println("Your grade is a B");
		}else if (grade>=50 && grade<=70) {
			System.out.println("Your grade is a C");
		}else if (grade<50) {
			System.out.println("Your grade is a F");
	}
}
}