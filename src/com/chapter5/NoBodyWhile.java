package com.chapter5;

public class NoBodyWhile {

	public static void main(String[] args) {
		int i = 100;
		int j = 200;
		while(++i < --j);
		System.out.println("Midpoint of i and j :"+i);

	}

}
