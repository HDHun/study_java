package com.urdomain.lecture.ch02;

public class LongExample {

	public static void main(String[] args) {
	long var1 =10;
	long var2 =20L;
//	long var3 =1000000000000000; //컴파일 에러
	long var4 =10000000000000L; //int 범위를 벗어나는 리터럴인 경우에는 뒤에 'L'을 붙여주어야한다.
	
	
	System.out.println(var1);
	System.out.println(var2);
	System.out.println(var4);
	
	}

}
