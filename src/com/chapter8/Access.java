package com.chapter8;

public class Access {

	public static void main(String[] args) {
		Y subObj = new Y();
		subObj.setij(10, 20);
		subObj.sum();
		System.out.println("Total is "+subObj.total);

	}

}
