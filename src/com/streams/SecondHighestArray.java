package com.streams;

import java.util.Arrays;

public class SecondHighestArray {

	public static void main(String[] args) {
		//try {
		int[] arrays= {64,89,34,28,65,10,98,90};
		Arrays.sort(arrays);
		int len = arrays.length;
		System.out.println("Highest Number:"+arrays[len-1]);
		System.out.println("Highest Number:"+arrays[len-2]);
		//System.out.println(arrays[len]);
		throw new NullPointerException();
		/*}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		
		}catch(Exception e) {
			e.printStackTrace();
		}*/
	}

}
