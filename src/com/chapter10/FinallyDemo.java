package com.chapter10;

public class FinallyDemo {

	public static void main(String[] args) {
		try {
			prodA();
		}catch(RuntimeException e) {
			System.out.println("Error at main method: "+e);//3
		}
		prodB();
		prodC();
	}

	static void prodA() {
		try {
			System.out.println("Try block prodA");//1
			throw new RuntimeException();
		}finally {
			System.out.println("procA finally");//2
		}
		
	}
	static void prodB() {
		try {
			System.out.println("Try block prodB");//4
		}finally {
			System.out.println("procB finally");//5
		}
		
	}
	static void prodC() {
		try {
			System.out.println("Try block prodC");//6
		}finally {
			System.out.println("procC finally");//7
		}
		
	}
	

}
