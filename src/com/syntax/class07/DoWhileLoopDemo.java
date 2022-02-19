package com.syntax.class07;

public class DoWhileLoopDemo {

	public static void main(String[] args) {

		int num=1;
		while(num<=3) {
			System.out.println("Hello");// Print 3 times
		num++;
		}
		System.out.println(" ------- ");
		int num1=1;
		do {
			System.out.println("Hello");
			num1++;
		}while(num1<=3);
	}
}