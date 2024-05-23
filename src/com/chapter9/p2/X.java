package com.chapter9.p2;

public interface X {
	void meth1();
	void meth2();
}
interface Y extends X{
	void meth3();
	
	 default void meth4() {
		 System.out.println("Calling meth4 method");
	 }
	 static void meth5() {
		 System.out.println("Calling meth5 method");
	 }
}

class Myclass implements Y{

	@Override
	public void meth1() {
		System.out.println("Calling meth1 method");
		
	}

	@Override
	public void meth2() {
		System.out.println("Calling meth2 method");
		
	}

	@Override
	public void meth3() {
		System.out.println("Calling meth3 method");
		
	}
	
}
