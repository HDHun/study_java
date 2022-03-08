package com.urdomain.lecture.exam;

public class ComputerExample {

	public static void main(String[] args) {
		
		int r = 7;
	
		Computer computer = new Computer();
		
		Calculator calculator = new Calculator();
		
		System.out.println("원의 반지름:" +r);
		
		System.out.println("Calculator 객체의 원면적 구하는 프로그램 실행:" + calculator.param(r));
		
		System.out.println("Computer 객체의 원면적 구하는 프로그램 실행:" + computer.param(r));
		

	}

}
