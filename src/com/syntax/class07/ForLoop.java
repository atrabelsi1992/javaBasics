package com.syntax.class07;

public class ForLoop {

	public static void main(String[] args) {
		/*
		 * initialization
		 * condition
		 * increment or decrement
		 * 
		 */
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("hello");
		}
		System.out.println("I need to print numbers from 1 to 20");
		
		/*
		 * Identify start point
		 * Identify end point
		 */
		
		for (int num=1; num<=20; num++) {
			System.out.println(num);
		}
		System.out.println("I need to print numbers 10 to 25");
		for(int i=10; i<=25; i++) {
			System.out.println(i);
		}
		System.out.println("I need to print numbers from 50 to 1");
		for(int num1=50; num1>=1; num1--) {
			System.out.println(num1);
		}
	}
}