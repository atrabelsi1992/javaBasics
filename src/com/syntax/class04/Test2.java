package com.syntax.class04;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your age");
		int age=input.nextInt();
		if (age>25);
		  System.out.println("Please enter your gender:M or F");
		String gender=input.next();
		if (gender.equalsIgnoreCase("F")){
		  System.out.println("Woman");
		}else {
		  System.out.println("Man");
		  int age2=input.nextInt();
			if (age2<25);
			  System.out.println("Please enter your gender:M or F");
			String gender2=input.next();
			if (gender2.equalsIgnoreCase("F")){
			  System.out.println("girl");
			}else {
			  System.out.println("boy");
		}
		}
}
}