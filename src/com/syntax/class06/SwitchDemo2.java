package com.syntax.class06;

public class SwitchDemo2 {

	public static void main(String[] args) {

		char choice='M';
		String answer;
		
		switch (choice) {
		case 'Y':
			answer="Yes";
			break;
		case 'N':
			answer="No";
			break;
		case 'M':
			answer="Maybe";
			break;
		default:
			answer="Unknown";
			break;
		}
		System.out.println(answer);
		
		System.out.println(" --------------- ");
		/*
		 * Declare a variable to store a car
		 * based on the value of car, define the country of origin
		 */
		
		String car="LADA";
		String country;
		
		switch (car.toLowerCase()) {
		case "bmw":
			country="Germany";
			break;
		case "ford":
			country="USA";
			break;
		case "lada":
			country="Russia";
			break;
		case "toyota":
			country="Japan";
			break;
		default:
			country="Unknown";
		}
		System.out.println(car +" is from "+country+" country");
	}		
}