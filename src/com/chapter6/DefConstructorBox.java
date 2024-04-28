package com.chapter6;

public class DefConstructorBox {

	public static void main(String[] args) {
		Box box1 = new Box();
		Box box2 = new Box();
		double vol;
		
		
		
		vol=box1.volumeRet();
		System.out.println("Volume of box1: "+vol);
		
		vol=box2.volumeRet();
		System.out.println("Volume of box2: "+vol);
	}

}
