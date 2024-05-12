package com.chapter8;

public class D extends C{
	int i ; //hides i of C class
	D(int a,int b){
		super.i=a;
		i=b;
	}
	void show() {
		System.out.println("Value of i in SuperClass:"+ super.i);
		System.out.println("Value of i in subClass:"+i);
	}
}
