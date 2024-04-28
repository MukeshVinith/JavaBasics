package com.chapter5;

public class BreakLabel {

	public static void main(String[] args) {
		first:for(int i =0;i<2;i++) {
			second:for(int j =0;j<2;j++) {
				third:for(int k=0;k<2;k++) {
					break second;
					
				}
				System.out.println("Reached second label end");
			}
			System.out.println("Reached first label end");
		}

	}

}
