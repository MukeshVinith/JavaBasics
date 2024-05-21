package com.chapter8;

public class AbstractDemo {

	public static void main(String[] args) {
		TharX2 thar = new TharX2();
		thar.driving();
		thar.bracking();
		thar.speaker();	}

}
abstract class TharX1{ //cannot create instance of class
	void driving() {
		System.out.println("Driving model Thar X1");
	}
	void bracking() {
		System.out.println("Stopping model Thar X1");
	}
	abstract void speaker();
}
class TharX2 extends TharX1{
	void driving() {
		System.out.println("Driving model Thar X2");
	}
	void bracking() {
		System.out.println("Stopping model Thar X2");
	}
	
	void speaker() {
		System.out.println("Dolby speakers using for Thar X2 model");
		
	}
	
}
