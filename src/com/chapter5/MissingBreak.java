package com.chapter5;

public class MissingBreak {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			switch (i) {
			case 0:
				System.out.println("i is zero");
			case 1:
				System.out.println("i is one");
			case 2:
				System.out.println("i is two");
			case 3:
				System.out.println("i is three");
			default:
				System.out.println("Greater than three");
			}
		}

	}
}
