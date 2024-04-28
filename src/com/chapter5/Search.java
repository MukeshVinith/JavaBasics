package com.chapter5;

public class Search {

	public static void main(String[] args) {
		int[] arr= {8,4,3,6,2,9,1,7,5};
		int val=39;
		boolean found = false;
		for(int x : arr) {
			if(x==val) {
				found=true;
				break;
			}
		}
		if(found) {
			System.out.println("Value founded");
		}else {
			System.out.println("Value not founded");
		}

	}

}
