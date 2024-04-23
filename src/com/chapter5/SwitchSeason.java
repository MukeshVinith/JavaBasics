package com.chapter5;

public class SwitchSeason {

	public static void main(String[] args) {
		int month = 4;
		String season;
		switch(month) {
		case 12:
		case 1:
		case 2:			//case under works like OR logic in if condition
			season="Winter";
			break;
		case 3:
		case 4:
		case 5:
			season="Summer";
			break;
		case 6:
		case 7:
		case 8:
			season="Spring";
			break;
		default:
			season="Rainy";
				
		}
		System.out.println("Season of April month is "+season);
	}

}
