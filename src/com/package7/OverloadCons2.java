package com.package7;

public class OverloadCons2 {

	public static void main(String[] args) {
		Box box1 = new Box();
		Box box2 = new Box(10,20,30);
		Box mycube = new Box(12);
		Box myclone = new Box(box2);
		double vol;
		
		vol = box1.volume();
		System.out.println("Volume of box1 :"+vol);
		
		vol = box2.volume();
		System.out.println("Volume of box2 :"+vol);

		vol = mycube.volume();
		System.out.println("Volume of mycube :"+vol);
		
		vol= myclone.volume();
		System.out.println("Volume of myclone :"+vol);
		


	}

}
