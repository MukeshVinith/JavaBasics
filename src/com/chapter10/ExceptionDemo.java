package com.chapter10;

public class ExceptionDemo {

	public static void main(String[] args)  {
		try {
			compute(1);
			compute(11);
		}catch(Exception e) {
			System.out.println("Exception at main method :"+e);
		}
		
	}
	
	static void compute(int x) throws MyException {
		if(x>10) {
			throw new MyException(x);
		}
		System.out.println("Value of x: "+x);
	}

}
