package com.syntax.class05;

import java.util.Scanner;

public class HwTime {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please input the current time using 24 hour format");
		int hour=input.nextInt();
		
		if (hour>=1 && hour<=11) {
			System.out.println("It's morning");
		}else if (hour>=12 && hour<=15) {
			System.out.println("It's afternoon");
		}else if (hour>=16 && hour<=20) {
			System.out.println("It's evening");
		}else if (hour>=21 && hour<=24) {
			System.out.println("It's night");
	}
}
}