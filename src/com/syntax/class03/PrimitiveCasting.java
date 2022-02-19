package com.syntax.class03;

public class PrimitiveCasting {

	//main+ctrl+space will auto completes the main method
	public static void main(String[] args) {
		
	int i=10;
	double d=10;
	System.out.println(i); //10 is the output
	System.out.println(d); //10.1 is the output
	int num=(int)10.99; //error: Type mismatch: cannot convert from double to int
	System.out.println(num);
	float f=10.99f; //We can also do float f=(float)10.99;
	byte b=(byte)1000;
	System.out.println(b);
	}
}