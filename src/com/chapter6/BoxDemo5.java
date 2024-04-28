package com.chapter6;

public class BoxDemo5 {

	public static void main(String[] args) {
		Box box1 = new Box();
		Box box2 = new Box();
		double vol;
		
		box1.setDim(5,5,5);
		
		vol=box1.volumeRet();
		System.out.println("Volume of box1: "+vol);
		
		box2.setDim(15,10,5);
		
		vol=box2.volumeRet();
		System.out.println("Volume of box2: "+vol);

	}

}
