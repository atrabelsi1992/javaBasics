package com.syntax.class04;

public class NestedIfMortgage {

	public static void main(String[] args) {

		double mortgageRate = 3.5;
		int mortgagePrice = 70000;

		if (mortgageRate > 4.5) {
			System.out.println("You can not buy a house.");
		} else {
			System.out.println("User will consider buying.");
			
		if (mortgagePrice>50000) {
			System.out.println("You should take a loan");
		}else {
			System.out.println("You can pay cash");
		}
		}
	}
}