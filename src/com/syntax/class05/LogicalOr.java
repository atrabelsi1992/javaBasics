package com.syntax.class05;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
		
		String day="Monday";
		
		if(day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("I have java class");
		}else {
			System.out.println("Code outside of if statement");
			
			/*Let's ask user what is todays date
			 * 
			 * Based on the day lets define which class we have
			 * 
			 * if (Monday or Friday) --> There is no class today
			 * else if (Tuesday or Wednesday) --> We have Manual Testing class today
			 * else if (Thursday) --> We have review class today
			 * else if (Saturday or Sunday) --> We have Java class today
			 */
			System.out.println("-----------------");
			Scanner input=new Scanner(System.in);
			System.out.println("Please enter day");
			
			day=input.nextLine();
			if (day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Friday")) {
				System.out.println("There is no class today");
			}else if (day.equalsIgnoreCase("Tuesday") || day.equalsIgnoreCase("Wednesday")) {
				System.out.println("We have Manual Testing class today");
			}else if (day.equalsIgnoreCase("Thursday")) {
				System.out.println("We have Review class today");
			}else if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
				System.out.println("We have Java class today");
			}else {
				System.out.println("Invalid entry");
			}
		}
	}
}