package com.syntax.class10;

public class TaskArrayReverse {

	public static void main(String[] args) {
		
		//Create an Array and retrieve all elements in reverse order
		
		int[] arr = {10, 20, 30, 40, 50, 60};
		
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-----------Reverse-----------");
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println(arr[5]);
		}
		System.out.println("-----------Another Way-----------");
		int[] arrs= {45, 23, 15};
		for (int i=0; i<arrs.length; i++) {
			System.out.println(arrs[arrs.length-i-1]);
		}
	}
}