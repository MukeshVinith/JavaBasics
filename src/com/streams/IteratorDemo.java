package com.streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<>();
		myList.add(7);
		myList.add(18);
		myList.add(10);
		myList.add(24);
		myList.add(17);
		myList.add(5);
		
		System.out.println("Original List:"+myList);
		
		Stream<Integer> str = myList.stream();
		
		Iterator itr = str.iterator();
		System.out.println("Arraylist using iterator:");
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}

	}

}
