package com.streams;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> myList = new ArrayList<>();
		myList.add(7);
		myList.add(18);
		myList.add(10);
		myList.add(24);
		myList.add(17);
		myList.add(5);
		
		System.out.println("Original List:"+myList);
		
		Stream<Integer> myListStream = myList.stream();
		
		Optional<Integer> minVal = myListStream.min(Integer::compare);
		if(minVal.isPresent()) {
			System.out.println("Min Value in list is : "+minVal.get());
		}else {
			System.out.println("No minimum value");
		}
		
		myListStream = myList.stream(); // Should consume a new stream as the previous stream will be closed
		Optional<Integer> maxVal = myListStream.max(Integer::compare);
		if(maxVal.isPresent()) {
			System.out.println("Min Value in list is : "+maxVal.get());
		}else {
			System.out.println("No maximum value");
		}
		
		
		Stream<Integer> sortStream = myList.stream().sorted();
	    sortStream.forEach(n->System.out.print(n+" "));
		System.out.println();
	    
	    System.out.println("Odd values in list");
	    Stream<Integer> oddValues = myList.stream().sorted().filter(n->(n % 2 != 0));	  
	    oddValues.forEach(n->System.out.print(n+" "));
	    System.out.println();
	    
	    
	    oddValues = myList.stream().sorted().filter(n->(n % 2 != 0));	  
	    System.out.println("Odd values in list greater than 5");
	    Stream<Integer> OddValGtF = oddValues.filter(n->(n>5));	 
	    OddValGtF.forEach(n->System.out.print(n+" "));
	    System.out.println();
	    
		
		

	}

}
