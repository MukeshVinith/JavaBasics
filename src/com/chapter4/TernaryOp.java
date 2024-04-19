package com.chapter4;

public class TernaryOp {

	public static void main(String[] args) {
		int i = 10;
		int k = i<0? -i : i;
		System.out.println("Absolute value of i is +"+k);//10
		i = -10;
		k = i<0? -i : i;
		System.out.println("Now Absolute value of i is +"+k);//-(-10)-->10
	}

}
