package com.syntax.class09;

public class Recap {

	public static void main(String[] args) {
for (int i=1; i<=4; i++) {
	System.out.println("A");
	//break;
	System.out.println("B");
}
		System.out.println(" ---------Example 2------ ");
for (int i=1; i<=3; i++) { //Outer loop controls number of complete iteration of inner loop
	for (int j=1; j<=3; j++) { //Inner loops alwways depends on outer loop
		System.out.println("Hello");
		break;

	}
	System.out.println("Good Morning");
	break;
}
System.out.println(" --------Example 3------- ");
for (int i=0; i<=3; i++) { 
	for (int j=1; j<=4; j++) { 
	System.out.println("Good Morning");
if (j==2) {
	continue;
	}
}
		System.out.println("Hello");
	}
}
}