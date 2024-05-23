package com.chapter9.p1;

public class SamePackage {
	SamePackage(){
		Protection p = new Protection();
		System.out.println("Samepackage constructor is called");
		System.out.println("n= "+p.n);
		//System.out.println("n_pri= "+p.n_pri);//only in same class because of private modifier
		System.out.println("n_pro= "+p.n_pro);
		System.out.println("n_pub= "+p.n_pub);
	}
}
