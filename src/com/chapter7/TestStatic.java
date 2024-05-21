package com.chapter7;

public class TestStatic {

	public static void main(String[] args) {
		/*
		 * System.out.println("Calling static value: "+UseStatic.a);
		 * System.out.println("Calling second static value:"+UseStatic.b);
		 */
		UseStatic.meth(10);
		new Testing().testing();
	}
	

}
class Testing{
	void testing(){
		System.out.println("Calling static value: "+UseStatic.a);
	}
}
