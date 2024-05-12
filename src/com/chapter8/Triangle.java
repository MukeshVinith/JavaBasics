package com.chapter8;

class Triangle extends Figure {

	Triangle(double a, double b) {
		super(a, b);
		
	}
	double area() {
		 System.out.println("Area for Triangle:");
		 return dim1*dim2/2;
	 }

}
