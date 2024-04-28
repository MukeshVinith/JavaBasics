package com.chapter5;

public class Return {

	public static void main(String[] args) {
		boolean t = true;
		
		System.out.println("Before the return");
		
		if(t) { //here without if JVM will throw unreachable code at line number 13
			return;
		}
		System.out.println("After the return");//Won't execute as return statement is executed
	}

}
