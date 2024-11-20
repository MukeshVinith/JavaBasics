package com.streams;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class SpliteratorDemo {

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
		
		Spliterator<Integer> itr = str.spliterator();
		
		Spliterator<Integer> itr2 = itr.trySplit();
		
		System.out.println("Arraylist using Spliterator2:");
		if(itr2 != null) {
			itr2.forEachRemaining(e->System.out.print(e+" "));
		}
		
		System.out.println();
		System.out.println("Arraylist using Spliterator1:");
		if(itr != null) {
			itr.forEachRemaining(e->System.out.print(e+" "));
		}
		

	
		
	}

}
