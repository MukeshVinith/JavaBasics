package com.chapter9.p1;

public class Derived extends Protection{
	Derived(){
		System.out.println("Derived constructor is called");
		System.out.println("n= "+n);
		//System.out.println("n_pri= "+n_pri);//only in same class because of private modifier
		System.out.println("n_pro= "+n_pro);
		System.out.println("n_pub= "+n_pub);
	}
	
}
