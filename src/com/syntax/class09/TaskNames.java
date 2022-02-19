package com.syntax.class09;

public class TaskNames {

	public static void main(String[] args) {
		System.out.println("----First Way----");
		String[] names = new String[6];
		
		names[0]="Omar";
		names[1]="Ahmed";
		names[2]="DJ Khaled";
		names[3]="Mike Jones";
		names[4]="Jason";
		names[5]="Vanessa";
		
		System.out.println("Your name is "+names[1]);
		
		System.out.println("----Second Way----");
		
		String[] names2 = {"Omar","Ahmed","DJ Khaled","Mike Jones","Jason","Vanessa",};
		System.out.println("Your name is "+names2[1]);
	}
}