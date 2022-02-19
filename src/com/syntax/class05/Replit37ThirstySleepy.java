package com.syntax.class05;

import java.util.Scanner;

public class Replit37ThirstySleepy {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		   System.out.println("Are you thirsty?");
		   boolean thirsty=input.nextBoolean();
		   System.out.println("Are you sleepy?");
		   boolean sleepy=input.nextBoolean();
		String bev;
		   if (thirsty && !sleepy){
		     bev = "water";
		   } else if (thirsty && sleepy){
		     bev = "coffee";
		   }else if (!thirsty && sleepy){
		     bev = "tea";
		   }else{
		     bev = "nothing";
		   }
		System.out.println("Looks like you need to drink "+bev);
		 }
		 }