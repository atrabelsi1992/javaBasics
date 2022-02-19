package com.syntax.class06;

import java.util.Scanner;

public class HwSale {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Do you have any sale today");
		String value = input.next();
		if (value.equals("yes")) {
			System.out.println("Enter the price of the item");
		int price=input.nextInt();
		int percent=0;
		
		if (price<20) {
			percent=10;
		}else if (price>=20 && price<=100) {
			percent=20;
		}else if (price<=100 && price<=500) {
			percent=30;
		}else {
			percent=50;
		}int saving=price-(price*percent)/100;
		System.out.println("After discount "+percent+"% the price of the item reduce from "+price+" to $"+saving);
		}else {
			System.out.println("you are not going for shopping");
		}
	}
}