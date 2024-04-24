package com.chapter5;

public class ForVarInfinite {

	public static void main(String[] args) {
		boolean done=false;
		int i =0;
		//for( ; ; ) //for loop infinite used for some operating systems
		for(;!done;) {
			if(i==10) {
				done=true;
			}
			i++;
			System.out.println("Value of i "+i);
		}

	}

}
