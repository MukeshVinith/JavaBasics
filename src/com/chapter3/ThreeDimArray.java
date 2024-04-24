package com.chapter3;

public class ThreeDimArray {

	public static void main(String[] args) {
		int[][][] threeD = new int[3][4][5];
		int i ,j, k,a=1;
		for(i=0;i<3;i++) {
			for(j=0;j<4;j++) {
				for(k=0;k<5;k++) {
					threeD[i][j][k]=a;
					a++;
				}
				
			}
		}
		/*
		 * for(i=0;i<3;i++) { for(j=0;j<4;j++) { for(k=0;k<5;k++) {
		 * System.out.print(threeD[i][j][k]+" "); } System.out.println(); }
		 * System.out.println(); }
		 */
		for(int x[][] : threeD ) {
			for(int y[]: x) {
				for(int temp : y) {
					System.out.print(temp+" ");
				}
				System.out.println();
				
			}
			System.out.println();
		}
	}

}
