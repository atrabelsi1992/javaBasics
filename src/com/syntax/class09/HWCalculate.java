package com.syntax.class09;

public class HWCalculate {
	public static void main(String[] args) {
		int[] numbers = new int[4];
		numbers[0] = 10;
		numbers[1] = 23;
		numbers[2] = 62;
		numbers[3] = 82;
		
		int sum=numbers[0] + numbers[1] + numbers[2] + numbers[3];
		System.out.println("The sum of all elements in an array is "+ sum);
	}
}