package com.streams;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		Map<String,String> det = new TreeMap<>();
		det.put("088","Mukesh");
		det.put("089","Sameer");
		det.forEach((key,value)->{
			System.out.println("Empid : "+key+" name : "+value);
		});
	}

}
