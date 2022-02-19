package com.syntax.class09;

public class TaskGrades {

	public static void main(String[] args) {

		System.out.println("----First Way----");
		String[] grades = new String[6];
		
		grades[0]="A";
		grades[1]="B";
		grades[2]="C";
		grades[3]="D";
		grades[4]="E";
		grades[5]="F";
		
		System.out.println("Your grade is "+grades[1]);
		
		System.out.println("----Second Way----");
		
		String[] grades2 = {"A","B","C","D","E","F",};
		System.out.println("Your grade is "+grades[1]);
	}
}