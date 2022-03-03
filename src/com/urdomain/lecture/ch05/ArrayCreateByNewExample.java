package com.urdomain.lecture.ch05;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {


		int[] arr1 = new int[3];
		
		for(int i = 0; i<3; i++) {
			System.out.println("arr1["+i+"]: " + arr1[i]);
		}
		
		
		arr1[0] = 1;
		arr1[1]	= 2;
		arr1[2] = 3;
		
		for(int i = 0; i<3; i++) {
			System.out.println("arr1["+i+"]: " + arr1[i]);
		}
		
		double[] arr2 = new double[3];
		
		arr2[0] = 1;
		arr2[1]	= 2;
		arr2[2] = 3;
		
		for(int i=0;i<3;i++) {
			System.out.println("arr2["+i+"]: " + arr2[i]);
			
		}
		
		
		String[] arr3 = new String[3];
		
		arr3[0] = "김";
		arr3[1] = "이";
		arr3[2] = "박";
		
		for(int i=0;i<3;i++) {
			System.out.println("arr3["+i+"]: " + arr3[i]);
			
		}
		
		
		
		

	}

}
