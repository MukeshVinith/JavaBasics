package com.chapter3;

public class ThreeDimArray {

	public static void main(String[] args) {
		int[][][] threeD = new int[2][4][5];
		int i ,j, k,a=1;
		for(i=0;i<3;i++) {
			for(j=0;j<4;j++) {
				for(k=0;k<5;k++) {
					threeD[i][j][k]=a;
					a++;
				}
				
			}
		}
		for(i=0;i<3;i++) {
			for(j=0;j<4;j++) {
				for(k=0;k<5;k++) {
					System.out.print(threeD[i][j][k]+" ");					
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
