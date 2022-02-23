package com.study.lecture.ch06;

public class FinalCarExample {

	public static void main(String[] args) {
		
		FinalCar finalCar = new FinalCar();
		
		finalCar.setSpeed(-50);
		
		// 잘못된 속도 변경
		System.out.println("현재 속도: " + finalCar.getSpeed());
		
		
		// 올바른 속도 변경
		finalCar.setSpeed(60);
		
		//멈춤
		if(!finalCar.isStop()) {
			finalCar.setStop(true);
			
		}
		System.out.println("현재 속도: " + finalCar.getSpeed());
	}

}
