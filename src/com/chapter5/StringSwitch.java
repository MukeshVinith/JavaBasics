package com.chapter5;

public class StringSwitch {

	public static void main(String[] args) {
		String num ="two";
		switch(num) {
		 case "one":
			 System.out.println("one");
			 break;
		 case "two":
			 System.out.println("two");
			 break;
		 case "three":
			 System.out.println("three");
			 break;
		 default:
			 System.out.println("No match");
		}
	}

}
