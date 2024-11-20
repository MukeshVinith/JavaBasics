package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapObjDemo {

	public static void main(String[] args) {
		List<NamePhoneEmail> namePhEmail = Arrays.asList(
				new NamePhoneEmail("Mukesh","709578xxxx","mukesh@gmail.com"),
				new NamePhoneEmail("Sameer","767182xxxx","sameer@gmail.com"),
				new NamePhoneEmail("Sridhar","709309xxxx","sridhar@gmail.com")
				);
		System.out.println("Original Values in list: ");
		namePhEmail.stream().forEach(e->{
			System.out.println(e.name+" "+e.phone+" "+e.email);
		});
		
		Stream<NamePhone> nameNphone = namePhEmail.stream().map(				
										e->new NamePhone(e.name,e.phone)
										);
		System.out.println("Mapped Values in list: ");
		nameNphone.forEach(e->{
			System.out.println(e.name+" "+e.phone);
		});

	}

}
