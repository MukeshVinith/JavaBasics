package com.chapter6;

public class MainCar {

	public static void main(String[] args) {
		Car c1 = new Car("Thar",4);
		Car c2 = c1;
		System.out.println("Getting model before reference become null :"+ c2.getModel());
		System.out.println("Getting No of wheels before reference become null :"+ c2.getNoOfWheels());
		c1=null;
		System.out.println("Getting model after reference become null :"+ c2.getModel());
		System.out.println("Getting No of wheels before reference become null :"+ c2.getNoOfWheels());

	}

}
class Car{
	String model;
	int noOfWheels;
	
	Car(String model,int noOfWheels){
		this.model=model;
		this.noOfWheels=noOfWheels;
		
	}

	public String getModel() {
		return model;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}
	
}
