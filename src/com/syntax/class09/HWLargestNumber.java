package com.syntax.class09;
public class HWLargestNumber {
	public static void main(String[] args) {
		int max = 0;
		int[] num = { 10, 263, 185, 1124, 2, 48 };
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}
		}
		System.out.println(max);
	}
}