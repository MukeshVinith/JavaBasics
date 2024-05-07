package com.chapter7;

public class RetObj {

	public static void main(String[] args) {
		Test obj1 = new Test(2);
		Test obj2 ;
		
		obj2=obj1.incrByTen();
		System.out.println("ob1.a: "+obj1.a);
		System.out.println("ob2.a: "+obj2.a);
		
		obj2=obj2.incrByTen();
		System.out.println("ob2.a after second increment: "+obj2.a);
	}

}
