package com.chapter5;

public class ForLoop {

	public static void main(String[] args) {
		int i;
		//for(int i = 10; i>0 ;i--) //if we initialize the variable in forloop the scope will be local for forloop 
		for(i = 10; i>0 ;i--) {
			System.out.println("tick :"+i);
		}

	}

}
