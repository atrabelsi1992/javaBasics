package com.syntax.class04;

import java.util.Scanner;

public class ScannerMonth {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		char gender;
		  int age;
		  System.out.println("Pleaase enter your gender: M or F");
		gender=input.next().charAt(0);
		System.out.println("Please enter your age");
		age=input.nextInt();
		if (age>25){
		  if(gender=='F'){
		    System.out.println("Woman");
		  }else {
		    System.out.println("Man");
		  }
		}else{
		  if(gender=='F'){
		    System.out.println("Girl");
		  }else{
		    System.out.println("Boy");
		  }
		}
		}
		}