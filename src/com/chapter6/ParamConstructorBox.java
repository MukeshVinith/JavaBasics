package com.chapter6;

public class ParamConstructorBox {
	public static void main(String[] args) {
		Box box1 = new Box(5,5,5);
		Box box2 = new Box(15,10,5);
		double vol;
				
		vol=box1.volumeRet();
		System.out.println("Volume of box1: "+vol);
		
		vol=box2.volumeRet();
		System.out.println("Volume of box2: "+vol);

	}
}
