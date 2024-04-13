package com.chapter3;

public class CharExample {

	public static void main(String[] args) {
		char ch1 = 'X';
		char ch2 = 89; //unicode value for Y
		
		System.out.println("Values of ch1 and ch2 are "+ch1 +" "+ch2);
		ch1++;
		ch2++;
		System.out.println("Increment Values of ch1 and ch2 are "+ch1 +" "+ch2); //increment success due to unicode
	}

}
