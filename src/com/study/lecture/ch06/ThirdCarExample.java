package com.study.lecture.ch06;

public class ThirdCarExample {

	public static void main(String[] args) {
		ThirdCar sc = new ThirdCar();
		
		System.out.println("sc.company:" + sc.company);
		System.out.println("sc.model:" + sc.model);
		System.out.println("sc.color:" + sc.color);
		System.out.println("sc.maxSpeed:" + sc.maxSpeed);
		
	
		ThirdCar sc2 = new ThirdCar("bbb");
		System.out.println( );
		System.out.println("sc2.model:" + sc2.model);
		
		ThirdCar sc3 = new ThirdCar("ccc","green");
		System.out.println( );
		System.out.println("sc3.model:" + sc3.model);
		System.out.println("sc3.color:" + sc3.color);

		ThirdCar sc4 = new ThirdCar("ddd","blue",240);
		System.out.println( );
		System.out.println("sc4.model:" + sc4.model);
		System.out.println("sc4.color:" + sc4.color);
		System.out.println("sc4.maxSpeed:" + sc4.maxSpeed);
	}

}
