package com.urdomain.lecture.ch06;

public class SecondCarExample {

	public static void main(String[] args) {


		
		SecondCar sc = new SecondCar();
		
		System.out.println("sc.company:" + sc.company);
		System.out.println("sc.model:" + sc.model);
		System.out.println("sc.color:" + sc.color);
		System.out.println("sc.maxSpeed:" + sc.maxSpeed);
		
	
		SecondCar sc2 = new SecondCar("bbb");
		System.out.println( );
		System.out.println("sc2.model:" + sc2.model);
		
		SecondCar sc3 = new SecondCar("ccc","green");
		System.out.println( );
		System.out.println("sc3.model:" + sc3.model);
		System.out.println("sc3.color:" + sc3.color);

		SecondCar sc4 = new SecondCar("ddd","blue",240);
		System.out.println( );
		System.out.println("sc4.model:" + sc4.model);
		System.out.println("sc4.color:" + sc4.color);
		System.out.println("sc4.maxSpeed:" + sc4.maxSpeed);
		
	
	

	}
}
