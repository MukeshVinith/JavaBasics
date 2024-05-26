package com.chapter10;

public class MyException extends Exception{
	private int a;
	
	MyException(int detail){
		a=detail;
	}
	
	public String toString() {
		return "MyException ["+a+"]";
	}
}
