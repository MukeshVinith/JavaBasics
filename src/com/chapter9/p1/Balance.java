package com.chapter9.p1;

public class Balance {
	String name;
	int bal;
	
	Balance(String name, int bal){
		this.name=name;
		this.bal=bal;
	}
	
	void show() {
		if(bal<0) {
			System.out.print("--->");
		}
		System.out.println(name+"$"+bal);
	}
}
