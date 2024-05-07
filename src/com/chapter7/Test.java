package com.chapter7;

public class Test {
	int a , b;
	Test(){
		
	}
	Test(int i){
		a=i;
	}
	Test(int i , int j){
		a=i;
		b=j;
	}
	boolean equalTo(Test o) {
		if(o.a==a&&o.b==b) {
			return true;
		}else {
			return false;
		}
	}

	
	void meth(int i, int j) {
		i *= 2;
		j /= 2;
	}
	
	void meth(Test ob){
		ob.a*=2;
		ob.b/=2;
	}
	
	Test incrByTen() {
		Test test = new Test(a+10);
		return test;
	}
	
}
