package com.chapter9.p2;

public class B implements A.NestedIF{

	@Override
	public boolean isNotNegative(int x) {
		
		return x<0?false:true;
	}

}
