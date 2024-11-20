package com.chapter10;

import java.util.Scanner;

public class Bhargav {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int minLimit = 90;
		System.out.println("MinLimit--->"+minLimit);
		int maxLimit = 105;
		System.out.println("MaxLimit--->"+maxLimit);
		double result = checkMinValue(minLimit,maxLimit);
		System.out.println("Result--->"+result);

	}

	private static double checkMinValue(int minLimit, int maxLimit) {
		double[] calValues = new double[2];
		Scanner sc = new Scanner(System.in);
		System.out.println("Give two calculated values--->");
		for(int i=0;i<2;i++) {
			calValues[i]=sc.nextDouble();
		}
		for(double temp: calValues){
			if(temp<minLimit||temp>maxLimit) {
				return 0;
			}
		}
		if(calValues[0]<calValues[1]) {
			return calValues[0];
		}else {
			return calValues[1];
		}
			
	}

}
