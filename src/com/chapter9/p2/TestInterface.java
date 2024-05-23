package com.chapter9.p2;

public class TestInterface {

	public static void main(String[] args) {
		Callback c = new Client();
		c.callback(42);
		Callback.testing();//here c do not know testing static method is 
		

	}

}
