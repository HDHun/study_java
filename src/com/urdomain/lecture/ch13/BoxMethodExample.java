package com.urdomain.lecture.ch13;

public class BoxMethodExample {

	public static void main(String[] args) {
		
//		Box<> box = Util.<>boxing();
		Box<Integer> box = Util.<Integer>boxing(100);
		int rtInt = box.get();
		
		System.out.println(rtInt);
		
		Box<String> box2 = Util.<String>boxing("Han");
		String rtString = box2.get();
		System.out.println(rtString);
		

	}

}
