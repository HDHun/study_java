package com.study.lecture.ch06;

public class FourthCalculatorExample {

	public static void main(String[] args) {

		FourthCalculator calculator = new FourthCalculator();
		
		
		double result1 = 10*10*FourthCalculator.pi;
		int result2 = FourthCalculator.plus(10,5);
		int result3 = FourthCalculator.minus(10,5);

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
	}

}
