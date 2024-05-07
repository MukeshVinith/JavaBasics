package com.chapter7;

public class InnerClassDemo {

	public static void main(String[] args) {
		/*
		 * Outer outer = new Outer(); outer.test();
		 *///commented for testing Outer1
		Outer1 outer = new Outer1();
		outer.test();

	}

}
class Outer{
	int outer_x=100;
	void test() {
		Inner inner = new Inner();
		inner.display();
	}
	class Inner{
		void display() {
			System.out.println("Value of outer_x in inner class: "+outer_x);
			int inner_y=200;
		}
	}
	void showy() {
		//System.out.println("Value of inner_y in outer class:"+inner_y); Error because inner_y is local to inner class
	}
	
}

