package com.chapter8;

public class A {
	int i , j ;
	void showij() {
		System.out.println("Values of i and j : "+i+" "+j);
	}
	A(){
		System.out.println("Constructor A is called");
	}
	//expanding usage of the code
	A(int x , int y){
		i=x;
		j=y;
	}
	
	void show() {
		System.out.println("Values of i and j : "+i+" "+j);
	}
	
}
