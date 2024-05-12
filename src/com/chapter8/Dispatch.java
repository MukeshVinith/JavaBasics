package com.chapter8;

public class Dispatch {

	public static void main(String[] args) {
		M m = new M();
		N n = new N();
		O o = new O();
		
		M r;
		r=m;
		r.callme();
		
		r=n;
		r.callme();
		
		r=o;
		r.callme();
		

	}

}
class M{
	void callme() {
		System.out.println("Calling method of class M");
	}
}
class N extends M{
	void callme() {
		System.out.println("Calling method of class N");
	}
}
class O extends M{
	void callme() {
		System.out.println("Calling method of class O");
	}
}