package com.streams;

import java.util.ArrayList;
import java.util.Optional;

public class ReduceOpeDemo {

	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<>();
		myList.add(7);
		myList.add(18);
		myList.add(10);
		myList.add(24);
		myList.add(17);
		myList.add(5);
		
		System.out.println("Original List:"+myList);
		
		Optional<Integer> productOfValue = myList.stream().reduce((a,b)->(a*b));
		if(productOfValue.isPresent()) {
			System.out.println("Multiplication of list"+productOfValue.get());
		}else {
			System.out.println("Multiplication of list not possible");
		}
		
		Optional<Integer> SumOfValue = myList.stream().reduce((a,b)->(a+b));
		if(SumOfValue.isPresent()) {
			System.out.println("Sum of list"+SumOfValue.get());
		}else {
			System.out.println("Sum of list not possible");
		}
		
		
		//Another Method is associate like below
		
		int productOfValueAsso = myList.stream().reduce(1,(a,b)->(a*b));
		System.out.println("Multiplication of list using assoicate :"+productOfValueAsso);
		
		
		
		
	}

}
