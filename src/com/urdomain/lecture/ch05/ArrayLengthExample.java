package com.urdomain.lecture.ch05;

public class ArrayLengthExample {

	public static void main(String[] args) {
		
		int[] score = {83,90,87};
		
		int sum = 0;
		
		System.out.println(score.length);
		
		
		for(int i=0; i<score.length; i++) {
			
			sum += score[i];
		}
		
		System.out.println("종합은 :" + sum);
		
		
		
		
		
		
		
		
		
	}

}
