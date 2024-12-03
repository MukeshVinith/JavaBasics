package com.lambda;

import java.util.Scanner;

public class LambdaDemoBol {

	public static void main(String[] args) {
		BooleanTest bool;
		Scanner sc = new Scanner(System.in);
		System.out.println("Check the value is even or odd :");
		int num = sc.nextInt();
		bool = n -> (n % 2 )== 0;
		if(bool.check(num)) {
			System.out.println("Given Number is even ");
		}else {
			System.out.println("Given Number is odd ");
		}

	}

}
