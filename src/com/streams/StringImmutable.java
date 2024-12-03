package com.streams;

public class StringImmutable {

	public static void main(String[] args) {
		String s1 = "Mukesh"; // "Java" String created in pool and reference assigned to s1

		String s2 = "Vinith";
		
		s1=s1.concat(s2);
		
		System.out.println(s1);
		
	}

}
