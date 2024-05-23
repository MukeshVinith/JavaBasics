package com.chapter9.p1;

public class AccountBalance {

	public static void main(String[] args) {
		Balance[] current = new Balance[3];
		current[0] = new Balance("Sameer",1000);
		current[1] = new Balance("Akhi",2000);
		current[2] = new Balance("Mukesh",-100);
		for(int i =0;i<current.length;i++) {
			current[i].show();
		}

	}

}
