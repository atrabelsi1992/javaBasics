package com.syntax.class09;
public class HWAnimals {
	public static void main(String[] args) {
		System.out.println(" ------First Way------ ");
		String[] animals1 = { "Dogs", "Cats", "Birds", "Fish", "Alligator" };
		for (String animalType : animals1) {
			System.out.println(animalType);
		}
		System.out.println(" ------Second Way------ ");
		String[] animals = { "Dogs", "Cats", "Birds", "Fish", "Alligator" };
		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i] + " ");
		}
	}
}