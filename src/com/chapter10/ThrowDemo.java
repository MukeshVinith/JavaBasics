package com.chapter10;

public class ThrowDemo {

	public static void main(String[] args) {
		try {
			demoproc();
		}catch(Exception e) {
			System.out.println("Exception at main method : "+e);
		}

	}
	static void demoproc() {
		try {
			throw new NullPointerException("demo");
		}catch(Exception e) {
			System.out.println("Exception at demoproc "+e);
			throw e;
		}
	}

}
