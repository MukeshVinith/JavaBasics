package com.lambda;

public class LambdaDemo {

	public static void main(String[] args) {
		MyNumber me;
		me = () -> 123.45;
		System.out.println("Value of my number:" + me.getValue());
		me = () -> Math.random() * 100;
		System.out.println("Random Value of my number:" + me.getValue());
		System.out.println("Another random Value of my number:" + me.getValue());
	}

}
