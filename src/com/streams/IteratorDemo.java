package com.streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
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
		
		/*Stream<Integer> str = myList.stream();
		
		Iterator itr = str.iterator();
		System.out.println("Arraylist using iterator:");
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		
		}*/
		
		//myList.forEach(System.out::println);
		//Collections.sort(myList);
		myList.forEach(n ->{
			System.out.print(n+" ");
		});
		System.out.println();
		
		Stream<Integer> str = myList.stream();
		List<Integer> secList = str.sorted().collect(Collectors.toList());
		secList.forEach(n->{
			System.out.print(n+" ");
		});
		

	}

}
