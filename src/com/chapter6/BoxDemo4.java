package com.chapter6;

public class BoxDemo4 {

	public static void main(String[] args) {
		Box box1 = new Box();
		Box box2 = new Box();
		double vol;
		
		box1.depth=5;
		box1.height=5;
		box1.width=5;
		
		vol=box1.volumeRet();
		System.out.println("Volume of box1: "+vol);
		
		box2.depth=5;
		box2.height=10;
		box2.width=15;
		
		vol=box2.volumeRet();
		System.out.println("Volume of box2: "+vol);

	}

}
