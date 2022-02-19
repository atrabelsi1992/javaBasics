package com.syntax.class07;

public class IncrementAndDecrement {

	public static void main(String[] args) {

		int num=10;
		
		num=num+1;
		num+=1; // similar to code above
		num++; // similar to code above
		
		System.out.println(num);
		
		//Increment operator adds 1 to a VARIABLE.
		
		num++;
		System.out.println(num);
		
		//10++;Increment operator doesn't add to VALUE
		
		//Decrement operator: Subtracts 1 from a variable
		
		num--;
		num--;
		num--;
		System.out.println(num);
		
		System.out.println(" ---------------- ");
		
		int time =10;
		if (time<12) {
			System.out.println("Morning"); // will print one time
		}
		
		while (time<12) {
			System.out.println("Morning");
		}
	}
}