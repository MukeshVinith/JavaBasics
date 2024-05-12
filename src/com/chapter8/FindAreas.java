package com.chapter8;

class FindAreas {

	public static void main(String[] args) {
		Figure f = new Figure(10,10);
		Rectangle r = new Rectangle(9,5);
		Triangle t = new Triangle(10,8);
		
		Figure fig;
		
		fig=f;
		System.out.println("Area is:"+fig.area());
		fig=r;
		System.out.println("Area is:"+fig.area());
		fig=t;
		System.out.println("Area is:"+fig.area());
		
	}

}
