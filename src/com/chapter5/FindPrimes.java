package com.chapter5;

public class FindPrimes {

	public static void main(String[] args) {
		int n =97;
		int flag=0;
		for(int i =2;i<n;i++) {
			if(n%i==0) {
				flag++;
			}
		}
		if(flag==0) {
			System.out.println("Given number "+n+" is prime number");
		}else {
			System.out.println("Given number "+n+" is not a prime number\"");
		}

	}

}
