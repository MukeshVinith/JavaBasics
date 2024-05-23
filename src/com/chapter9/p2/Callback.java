package com.chapter9.p2;

public interface Callback {
	void callback (int p);
	static void testing() {
		System.out.println("This method is in interface");
	}
}
