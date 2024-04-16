package com.chapter3;

public class AverageArray {

	public static void main(String[] args) {
		double grades[]= {1.0,2.2,5.4,7.6,9.5};
		double sum = 0.0;
		for(int i=0;i<5;i++) {
			sum=sum+grades[i];
			
		}
		double average=sum/5;
		System.out.println("Average of grades="+average);
	}

}
