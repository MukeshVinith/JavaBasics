package com.chapter8;

public class Box {
	double width;
	double height;
	double depth;

	Box(){
		width=-1;
		height=-1;
		depth=-1;
	}
	Box(double width,double height,double depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	Box(double len){
		width=height=depth=len;
	}
	
	Box(Box ob){//object paasing as argument or parameter
		width=ob.width;
		height=ob.height;
		depth=ob.depth;
	}
	
	double volume() {
		return width*height*depth;
	}
}
