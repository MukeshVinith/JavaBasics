package com.lambda;

import java.util.Scanner;

public class GenericLambda {

	public static void main(String[] args) {
		System.out.println("Given a String to reverse: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		GenericInterface<String> inf = (s) -> {
			StringBuffer result = new StringBuffer();
			char[] charArray = str.toCharArray();
			for (int i = charArray.length -1  ; i>=0;i--) {
				result.append(charArray[i]);
			}
			return result.toString();
			
		};
		System.out.println("Reversal of given string is : "+ inf.value(str).toLowerCase());
	}

}
