package com.chapter5;

public class ForEach3 {

	public static void main(String[] args) {
		int[][] num = new int[3][3];
		int value=0;
		int sum=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				num[i][j]=value;
				value++;
			}
		}
		
		for(int x[]: num) {
			for(int y:x) {
				System.out.print(y+" ");
				sum+=y;
			}
			System.out.println();
		}
		System.out.println("Value of sum of array: "+sum);
	}

}
