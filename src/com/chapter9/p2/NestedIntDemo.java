package com.chapter9.p2;

public class NestedIntDemo {

	public static void main(String[] args) {
		A.NestedIF nein = new B();
		if(nein.isNotNegative(2)) {
			System.out.println("2 is not negative");
		}
		if(nein.isNotNegative(-2)) {
			System.out.println("This won't be displayed");
		}
	}

}
