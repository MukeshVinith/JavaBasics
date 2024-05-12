package com.chapter8;

public class DemoSuperClass {

	public static void main(String[] args) {
		BoxWeight box1 = new BoxWeight(10,20,30,27.5);
		BoxWeight box2 = new BoxWeight(15,30,45,54);
		BoxWeight box3 = new BoxWeight();//default
		BoxWeight box4 = new BoxWeight(20,12);
		BoxWeight box5 = new BoxWeight(box1);
		double vol;
		
		vol = box1.volume();
		System.out.println("Volume of box1 is: "+vol);
		System.out.println("Weight of box1 is: "+box1.weight);
		System.out.println();
		vol = box2.volume();
		System.out.println("Volume of box2 is: "+vol);
		System.out.println("Weight of box2 is: "+box2.weight);
		System.out.println();
		vol = box3.volume();
		System.out.println("Volume of box2 is: "+vol);
		System.out.println("Weight of box2 is: "+box3.weight);
		System.out.println();
		vol = box4.volume();
		System.out.println("Volume of box2 is: "+vol);
		System.out.println("Weight of box2 is: "+box4.weight);
		System.out.println();
		vol = box5.volume();
		System.out.println("Volume of box2 is: "+vol);
		System.out.println("Weight of box2 is: "+box5.weight);
		System.out.println();
		
		
	}

}
