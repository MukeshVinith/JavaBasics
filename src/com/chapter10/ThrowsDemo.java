package com.chapter10;

public class ThrowsDemo {

	public static void main(String[] args) {
		try {
			prodA();
		} catch (NullPointerException e) {
			System.out.println("Exception at main method" + e);
		}

	}

	private static void prodA() throws NullPointerException {
		System.out.println("Exception at prodA method");
		throw new NullPointerException();

	}

}
