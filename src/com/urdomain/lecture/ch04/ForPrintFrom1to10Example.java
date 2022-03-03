package com.urdomain.lecture.ch04;

public class ForPrintFrom1to10Example {

	public static void main(String[] args) {


		
		//(초기화식, 조건식, 증감식)
//		int sum = 0;
//		for(int i=1; i<=10; i++) {
//			sum += i;	
//			// sum = sum + i;
//		}
//		System.out.println(sum);
		
		
		
		
		for(int i = 1; i<=9; i++) {
			for(int j = 1; j<=9; j++) {
				
				System.out.println(i + "X" + j + " = " + (i*j));
			}
		}
		
		
		
		

	}

}
