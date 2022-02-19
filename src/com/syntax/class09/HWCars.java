package com.syntax.class09;
public class HWCars {
	public static void main(String[] args) {
		System.out.println(" ------First Way------ ");
		String[] cars = new String[6];
		cars[0] = "Toyota";
		cars[1] = "Honda";
		cars[2] = "BMW";
		cars[3] = "VW";
		cars[4] = "Mercedes";
		cars[5] = "Tesla";
		for (String car : cars) {
			System.out.println(car + " ");
		}
		System.out.println(" ------Second Way------ ");
		String[] car = { "Toyota", "Honda", "BMW", "VW", "Mercedes", "Tesla" };
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i] + " ");
		}
	}
}