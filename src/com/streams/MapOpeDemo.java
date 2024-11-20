package com.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class MapOpeDemo {

	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<>();
		myList.add(7);
		myList.add(18);
		myList.add(10);
		myList.add(24);
		myList.add(17);
		myList.add(5);
		
		System.out.println("Original List:"+myList);
		
		Stream<Integer> squOfListValues = myList.stream().map(n->(n*n));
		
		System.out.println("Sqaures of all elements in List:");
		squOfListValues.forEach(System.out::println);

	}

}
