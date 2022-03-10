package com.urdomain.lecture.ch08;

public class DefaultMethodExample {

	public static void main(String[] args) {

		MyInterface myInterface = new MyClassA();
		
		myInterface.methodA();
//		myInterface.methodB();
		
		
		
		MyInterface myInterface2 = new MyClassB();
		
		myInterface2.methodA();
//		myInterface2.methodB();
		
		
		
		
		

	}

}
