package com.syntax.class08;

public class ForLoopsPractice {

	public static void main(String[] args) {
		for(int i=1; i<=3; i++) {
			System.out.println("Hello "+i);
		}
		System.out.println(" Multiplication Table ");
		/*
		 * 3 x 1 = 3
		 * 3 x 2 = 6
		 * 3 x 3 = 9
		 * 3 x 10 = 30
		 */
		
		int num=7;
		int result;
		for(int i=1; i<=10; i++) {
			result=num*i;
			System.out.println(num+" X "+i+" = "+result);
		}
		System.out.println(" What is the Output"); //print by 3s
		for(int i=0; i<=10; i+=3) {
			System.out.println(i+" "); // 0, 3, 6, 9
		}
		System.out.println(" What is the Output");
		int sum=0;
		for(int i=1; i<=5; i++) {
			sum+=i;
		}
		System.out.println(sum);
}
}