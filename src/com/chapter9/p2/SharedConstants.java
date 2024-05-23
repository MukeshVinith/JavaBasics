package com.chapter9.p2;

import java.util.Random;

public interface SharedConstants {
	int NO = 0;
	int YES = 1;
	int MAYBE=2;
	int LATER=3;
	int SOON=4;
	int NEVER=5;
	
	
}
class Question implements SharedConstants{
	Random r = new Random();
	int ask() {
		int prob = (int)(100*r.nextDouble());
		if(prob<30) {
			return NO;
		}
		else if(prob<60) {
			return YES;
		}else if(prob<75) {
			return LATER;
		}else if(prob<98) {
			return SOON;
		}
		else
			return NEVER;
	}
}
class Askme implements SharedConstants{
	static void answer(int result) {
		switch(result) {
		 case NO:
			 System.out.println("No");
			 break;
		 case YES:
			 System.out.println("Yes");
			 break;
		 case LATER:
			 System.out.println("Later");
			 break;
		 case SOON:
			 System.out.println("Soon");
			 break;
		 case NEVER:
			 System.out.println("Never");
			 break;
		default:
			System.out.println("Default");
		
		}
		
	}
}