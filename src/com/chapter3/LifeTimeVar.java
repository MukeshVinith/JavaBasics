package com.chapter3;

public class LifeTimeVar {

	public static void main(String[] args) {
		int x ;
		
		for(x=0;x<3;x++) {
			int y = -1;//block will be initialized everytime it enter the for block
			System.out.println("y is "+y);
			y=100;
			System.out.println("Now y is "+y);
			
		}
	}

}
