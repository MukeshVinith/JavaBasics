package com.chapter3;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Height of pattern");
		int height = sc.nextInt();
		int maxStar = (height*2)-1;
		//System.out.println("maxStar--->"+maxStar);
		int max=0;
		int min=0;
		for(int i =0;i<maxStar;i++) {
			max=(maxStar/2)+(i+2);
			//System.out.println("max--->"+max);
			min=max-(2*i);
			for(int j=0;j<height;j++) {
				if((min<=j) && (max>=j)) {
					System.out.print("*"+" ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
