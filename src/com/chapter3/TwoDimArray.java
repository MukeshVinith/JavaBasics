package com.chapter3;

public class TwoDimArray {

	public static void main(String[] args) {
		int i,j,k =0 ;
		int[][] array = new int[4][5];
		for(i=0;i<4;i++) {
			for(j=0;j<5;j++) {
				array[i][j]=k;
				k++;
			}
		}
		for(i=0;i<4;i++) {
			for(j=0;j<5;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
