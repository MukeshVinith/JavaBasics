package com.chapter8;

class Rectangle extends Figure {

	Rectangle(double a, double b) {
		super(a, b);
		
	}
	double area() {
		 System.out.println("Area for Rectangle:");
		 return dim1*dim2;
	 }

}
