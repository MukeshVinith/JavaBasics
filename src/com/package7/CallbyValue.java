package com.package7;

public class CallbyValue {

	public static void main(String[] args) {
		Test ob = new Test();
		int a = 25,b= 20;
		System.out.println("Values of a and b before calling the method:"+a+" and "+b);
		ob.meth(a, b);
		System.out.println("Values of a and b after calling the method:"+a+" and "+b);
	}

}
