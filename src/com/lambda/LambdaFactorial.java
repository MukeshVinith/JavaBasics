package com.lambda;

import java.util.Scanner;

public class LambdaFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to be factorial :");
		int num = sc.nextInt();
		FactorialInterface factorial = (n)->{
			int result = 1;
			while(n!=1) {
				result *= n;
				n--;
			}
			return result;
		};
		System.out.println("Factorial of given number " + num + " is : " + factorial.getFact(num));

	}

}
