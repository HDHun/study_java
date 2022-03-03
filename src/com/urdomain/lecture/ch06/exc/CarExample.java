package com.urdomain.lecture.ch06.exc;

public class CarExample {

	public static void main(String[] args) {


		Car car = new Car(); // 생성자
		
//		객체접근연산자(.)를 사용하여 car 객체변수의 값을 참조
		System.out.println("company: " + car.company);
		System.out.println("model: " + car.model);
		System.out.println("color: " + car.color);
		System.out.println("maxSpeed: " + car.maxSpeed);
		System.out.println("Speed: " + car.speed);
		
		
		
		car.speed = 100;
		
		System.out.println("Speed: " + car.speed);
		
		
//		speed가 maxSpeed 보다 속도가 높은지 낮은지를 출력해주는 함수를 만들어서 출력하시오.
		same(car.maxSpeed,car.speed);
	}

	public static void same(int speed, int maxSpeed) {	
		
		if(speed < maxSpeed){
			System.out.println("maxspeed가 큼");
		}else {
			System.out.println("maxspeed가 작음");
		}
		
		
	}
	
	
	
	
}
