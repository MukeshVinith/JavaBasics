package com.chapter8;

public class MultipleInheritance {

	public static void main(String[] args) {
		double vol;
		Shipment box1 = new Shipment(10,20,30,27.5,100);
		Shipment box2 = new Shipment(15,30,45,54,200);
		
		vol = box1.volume();
		System.out.println("Volume of box1 is: "+vol);
		System.out.println("Weight of box1 is: "+box1.weight);
		System.out.println("Cost for shipment for box1: "+box1.cost);
		System.out.println();
		
		vol = box2.volume();
		System.out.println("Volume of box1 is: "+vol);
		System.out.println("Weight of box1 is: "+box2.weight);
		System.out.println("Cost for shipment for box1: "+box2.cost);
		System.out.println();

	}

}
