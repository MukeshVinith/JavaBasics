package com.chapter6;

public class BoxDemo3 {

	public static void main(String[] args) {
		Box box1 = new Box();
		Box box2 = new Box();
		
		box1.depth=5;
		box1.height=5;
		box1.width=5;
		
		box1.volume();
		
		box2.depth=5;
		box2.height=10;
		box2.width=15;
		
		box2.volume();

	}

}
