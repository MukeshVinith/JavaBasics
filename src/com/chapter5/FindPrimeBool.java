package com.chapter5;

public class FindPrimeBool {

	public static void main(String[] args) {
	 int num = 23;
	 boolean isPrime = findPrime(num);
	 if(isPrime) {
		 System.out.println(num+" given number is prime number");
	 }else {
		 System.out.println(num+" given number is not prime number");
	 }
	 

	}

	public static boolean findPrime(int num) {
		int flag=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				flag++;
			}
		}
		if(flag>0) {
			return false;
		}else {
			return true;
		}
	}

}
