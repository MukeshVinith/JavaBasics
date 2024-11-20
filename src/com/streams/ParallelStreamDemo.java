package com.streams;

import java.util.ArrayList;


public class ParallelStreamDemo {
	
	public static void main(String[] args) {
		ArrayList<Double> myList = new ArrayList<>();
		myList.add(7.0);
		myList.add(18.0);
		myList.add(10.0);
		myList.add(24.0);
		myList.add(17.0);
		myList.add(5.0);
		
		System.out.println("Original List:"+myList);
		
		double prodOfSquRoot = myList.parallelStream().reduce(1.0,(a,b)->a*Math.sqrt(b),(a,b)->a*b);
		
		System.out.println("Product of Square Root of List: "+prodOfSquRoot);
		
		
		
		
	}
}
