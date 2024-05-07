package com.chapter7;

public class StaticByName {

	public static void main(String[] args) {
		System.out.println("Value of a : "+StaticDemo.a);
		System.out.println("Value of b : "+StaticDemo.b);
		System.out.println("Value of result : ");//static fields and methods can be called using classname only
		StaticDemo.result();
		
		StaticDemo.a=300;
		System.out.println("Value of a : "+StaticDemo.a);
		
	}

}
