package com.chapter9.p2;

import com.chapter9.p1.Protection;

public class OtherPackage {
	OtherPackage(){
		Protection p = new Protection();
		System.out.println("OtherPackage constructor is called");
		//System.out.println("n= "+p.n);
		//System.out.println("n_pri= "+p.n_pri);//only in same class because of private modifier
		//System.out.println("n_pro= "+p.n_pro);
		System.out.println("n_pub= "+p.n_pub);
	}
}
