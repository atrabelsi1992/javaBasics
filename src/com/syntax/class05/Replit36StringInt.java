package com.syntax.class05;

import java.util.Scanner;

public class Replit36StringInt {
	public static void main(String[] args){
		   Scanner input=new Scanner(System.in);
		    System.out.println("Please enter your mark");
		    int gradeScore=input.nextInt();
			String grade = null;
				
				if (gradeScore>=1 && gradeScore<=25) {
					grade = "F";
				}else if (gradeScore>=26 && gradeScore<=45) {
					grade = "E";
				}else if (gradeScore>=46 && gradeScore<=50) {
					grade = "D";
				}else if (gradeScore>=51 && gradeScore<=60) {
				  grade = "C";
		    }else if (gradeScore>=61 && gradeScore<=80) {
				  grade = "B"; 
		    }else if (gradeScore>=80) {
				  grade = "A";
		  }else {
		    System.out.println("Please enter valid mark");
		  } 
		  System.out.println("Your grade is "+grade);
		 }
}