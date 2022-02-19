package com.syntax.class10;

public class TwoDArrayAnotherWay {

	public static void main(String[] args) {

		int [][] numbers= {
				{10, 20, 30, 40}, // Index 0
				{100, 200, 300, 400}, // Index 1
				{1000, 2000, 3000, 4000}, // Index2
		};
		System.out.println(numbers[2][1]);// 2000
	}
}