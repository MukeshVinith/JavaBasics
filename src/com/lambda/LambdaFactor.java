package com.lambda;

import java.util.Scanner;

public class LambdaFactor {

	public static void main(String[] args) {
		FactorInterface factor;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of num:");
		int num = sc.nextInt();
		System.out.println("Enter the value of den:");
		int den = sc.nextInt();
		factor = (n, d) -> (n % d == 0);
		if (factor.isFactor(num, den)) {
			System.out.println("Given " + num + " is factor to " + den);
		} else {
			System.out.println("Given " + num + " is not factor to " + den);
		}
	}

}
