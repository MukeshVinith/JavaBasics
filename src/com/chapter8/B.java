package com.chapter8;

public class B extends A {
	int k ;
	void showk() {
		System.out.println("Value of k is: "+k);
	}
	void sum() {
		System.out.println("Sum of the values : "+(i+j+k));
	}

	B() {
		System.out.println("Constructor B is called");
	}
//added code for more utilization
	B(int i , int j , int k ){
		super(i,j);
		this.k = k ;
	}
		
	void show() {
		System.out.println("Value of k is: "+k);
	}
}
