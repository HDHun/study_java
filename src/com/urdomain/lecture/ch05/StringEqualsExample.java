package com.urdomain.lecture.ch05;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";

		
		if(strVar1 == strVar2) { //주소 비교
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}	else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) { //문자열 비교
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		if(strVar3 == strVar4) { // 주소 비교
			System.out.println("strVar3과 strVar4는 참조가 같음");
		}	else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		if(strVar3.equals(strVar4)) { //문자열 비교
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
		
		
//		배열 : 동일 데이터들의 집합
//			ex) 1학년 2반 학생들의 수학 성적(15명)
//			78,44,30,95,100....88(15개)
//			int mathScore010201 = 78;
//			int mathScore010202 = 44;
//			int mathScore010205 = 100;
//			...
//			int mathScore010215 = 88;
//			int mathScore0102 = {78,44,100,...88}; : 배열 ,n*n가능
//			
		
		
		
//		선언
		
		
	}

}
