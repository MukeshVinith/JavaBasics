package com.chapter8;

public class DemoBoxWeight {

	public static void main(String[] args) {
		double vol;
		BoxWeight box1 = new BoxWeight(10,20,30,27.5);
		BoxWeight box2 = new BoxWeight(15,30,45,54);
		vol = box1.volume();
		System.out.println("Volume of box1 is: "+vol);
		System.out.println("Weight of box1 is: "+box1.weight);
		System.out.println();
		vol = box2.volume();
		System.out.println("Volume of box2 is: "+vol);
		System.out.println("Weight of box2 is: "+box2.weight);
	}

}
