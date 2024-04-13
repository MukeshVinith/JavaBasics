package com.chapter3;

public class LongExample {

	public static void main(String args[]) {
		
		int lightspeed;
		long days;
		long seconds;
		long distance;
		
		lightspeed=186000;
		days=1000;
		seconds=1000*24*60*60; //days converting into seconds
		distance=lightspeed * seconds; //cal of distance traveled 
		
		System.out.println("The light have traveled the distance of "+distance+" in days of "+days);
		
		/*
		 * //if you declare distance and seconds as int the value of distance will be
		 * out of range for int and print negative value will is wrong
		 */
		
		
	}

}
