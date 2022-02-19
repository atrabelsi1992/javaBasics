package com.syntax.class03;

public class MoreExamples {

	public static void main(String[] args) {
	/*Define a variable to store a browser
	 * If browser is chrome --> We are executing tests on chrome
	 * Otherwise --> I'm not executing any test cases
	 */
	String browser="chrome";
	if (browser.equals("chrome")) {
		System.out.println("We are executing tests on chrome");
	}else {
		System.out.println("I'm not executing any test cases");
	}
	}

}
