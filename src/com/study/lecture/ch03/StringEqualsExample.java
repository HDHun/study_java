package com.study.lecture.ch03;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "한동훈";
		String str2 = "한동훈";
		String str3 = new String("한동훈");
		
		
		
		boolean result1 = (str1 == str2);
		System.out.println("result1:" +result1);
	
		boolean result2 = (str1 == str3);
		System.out.println("result2:" +result2);
		
		System.out.println("str1.equls(str2): " + str1.equals(str2));
		System.out.println("str1.equls(str3): " + str1.equals(str3));
	
	}

}