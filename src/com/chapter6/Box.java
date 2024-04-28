package com.chapter6;

public class Box {
	double width;
	double height;
	double depth;
	
	void volume() {
		System.out.print("Vol is :");
		System.out.println(width*height*depth);
	}
	
	double volumeRet() {
		return width*height*depth;
	}
	
	void setDim(double w,double h,double d) {//user-defined function
		width=w;
		height=h;
		depth=d;
	
	}
	Box(){ //default constructor
		System.out.println("Called Box Default Constructor");
		width=10;
		height=10;
		depth=10;
	}
	Box(double width,double height,double depth){ //Parameterized constructor
		System.out.println("Called Box Default Constructor");
		this.width=width;
		this.height=height;
		this.depth=depth;
		
	}
}
