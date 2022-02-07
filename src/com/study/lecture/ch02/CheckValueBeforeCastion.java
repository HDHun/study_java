package com.study.lecture.ch02;

public class CheckValueBeforeCastion {

	public static void main(String[] args) {
		
		
		int i = 127;
		
		if ( i < Byte.MIN_VALUE)   (i > Byte.MAX_VALUE) {
			System.out.println("byte 타입으로 변환 불가능");
			System.out.println("값 확인 필요");
		} else {
			byte b = (byte) i;
			System.out.println(b);
			System.out.println(캐스팅완료;);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
