package com.syntax.class10;

public class AllValuesfrom2dArray {

	public static void main(String[] args) {
		int[][] numbers = { { 10, 20, 30 }, // Index 0
				{ 100, 200, 300, 400 }, // Index 1
				{ 1000, 2000}, // Index2
		};
		
		System.out.println("-----All Elements-----");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.println(numbers[i][j]);
			}
		}

		// numbers.length --> gives # of rows
		
		System.out.println("Example");
		int size = numbers.length;// When used with 2d Array gives # of 1d Arrays that we stored.

		System.out.println(size);// value of the rows.

		int sizeOf1Array = numbers[0].length;
		System.out.println(sizeOf1Array);// value of the columns.

		int sizeOf2Array = numbers[1].length;
		System.out.println(sizeOf2Array);// value of the columns.

		int sizeOf3Array = numbers[2].length;
		System.out.println(sizeOf3Array);// value of the columns.

		// Retrieving all elements from 2D Array
		
	}
}