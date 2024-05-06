package com.package7;

public class PassObjRef {

	public static void main(String[] args) {
		Test ob = new Test(25,20);
		System.out.println("Values of a and b before calling the method:"+ob.a+" and "+ob.b);
		ob.meth(ob);
		System.out.println("Values of a and b after calling the method:"+ob.a+" and "+ob.b);

	}

}
