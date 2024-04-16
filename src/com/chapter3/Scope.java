package com.chapter3;

public class Scope {

	public static void main(String[] args) {
		int x = 10; //known to every sub scope of main methos
		
		if(x==10) {
			int y = 20; //only known to this block
			
			//x and y both identifiers known here
			
			System.out.println("Values of x and y :"+x +" "+y );
			
		}
		//y=30;// error y is not known here 
		
		//x is still known here
		System.out.println("x outside the if block and inside the main block: "+x);
	}

}
