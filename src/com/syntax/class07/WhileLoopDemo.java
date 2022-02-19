package com.syntax.class07;

public class WhileLoopDemo {

	public static void main(String[] args) {

	int i=1;
	while (i<=5 ) {
		System.out.println(i);
		i++;
	}
	System.out.println("The value of i outside of while loop = "+i);
	
	//I need to print values from 2 to 20
	
	int num=2;
	while (num<=20) {
		System.out.println(num);
		num++;
		
	}
	//I need to print values from 1 to 50 in 1 line
	
		int num1=1;
		while (num1<=50) {
			System.out.print(num1+" ");
			num1++;
			
		}
		//I need to print values from 20 to 1
		System.out.println(" -- I need numbers 20 to 1 --");
			int num2=20;
			while (num2>=1) {
				System.out.print(num2+" ");
				num2--;
				
			}
		System.out.println("The End");
		
	}
}