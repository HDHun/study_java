package com.urdomain.lecture.ch13;

public class BoundedTypeParameterExample {

	public static void main(String[] args) {


		int result1 = Util3.compare(10, 20);
		System.out.println("result1:" + result1);
		int result2 = Util3.compare(20, 10);
		System.out.println("result2:" + result2);

	}

}
