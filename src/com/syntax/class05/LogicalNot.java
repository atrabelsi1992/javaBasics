package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {

		// Logical NOT is used to revert the condition

		boolean value = !false;

		System.out.println(value);

		System.out.println("---------");

		boolean traffic = false;

		if (!traffic) {
			System.out.println("I will arrive on time to work");
		}

		System.out.println("----------");

		String day = "Saturday";
		if (!day.equalsIgnoreCase("Saturday")) {
			System.out.println("Today is not Saturday");
		}

		boolean checkboxChecked = false;

		if (!checkboxChecked) {
			System.out.println("I will click on that checkbox");
		}

		System.out.println("------- THE END --------");
	}
}