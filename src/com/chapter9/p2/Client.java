package com.chapter9.p2;

public class Client implements Callback {

	@Override
	public void callback(int p) {
		System.out.println("Callback called with"+p);
		
	}
	void nonIntMeth() {
		System.out.println("Class can have other methods too compared to interface");
	}

}
