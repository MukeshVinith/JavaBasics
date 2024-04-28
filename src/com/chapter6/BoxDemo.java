package com.chapter6;

public class BoxDemo {

	public static void main(String[] args) {
		Box box1= new Box();
		double vol;
		box1.depth=5;
		box1.height=5;
		box1.width=5;
		
		vol= box1.depth * box1.height * box1.width;
		System.out.println("Volume of the box: "+vol);
	}

}

