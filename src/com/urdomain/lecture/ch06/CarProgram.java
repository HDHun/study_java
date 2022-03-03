package com.urdomain.lecture.ch06;

public class CarProgram {

	public static void main(String[] args) {


		
		int a = 1;
		
		Car car = new Car();
		
		Car car2;
		car2 = new Car();
		
		
//		. : 객체접근연산자
		System.out.println(car.company);

		
		car.a = car.speedUp(10);
		System.out.println(car.a);
		
		
	}

}
