package com.chapter3;

public class DoubleExample {

	public static void main(String[] args) {
		double area;
		double radius;
		
		radius=5;
		System.out.println("The radius of the circle is :"+radius);
		
		area = 3.14*radius*radius;
		System.out.println("Area of the circle is :"+area);
		
		/* if you change area and radius to float error shows at compile time error*/
	}

}
