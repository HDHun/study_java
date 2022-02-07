package com.study.lecture.ch02;

public class Variable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// 변수 명명법
		// 첫글자 소문자 그리고 다음 문자열 부터는 대문자
		// 모든 변수명은 붙여서 사용
		// 대소문자 구분함
		
//		fullName 카멜표기법 변수.함수
//		full_name 스네이크법 db
//		FullName 파스칼
		
		
		/*
		 * String fullName = "Donghun Han"; String name = "Donghun";
		 * 
		 * 
		 * 
		 * 
		 * int roomNumber = 1; int roomnumber = 2;
		 * 
		 * System.out.println("roomNumber: " + roomnumber);
		 * System.out.println("roomnumber: " + roomNumber);
		 * 
		 * 
		 */
	
		// 예약어는 사용 할 수 없다.
		// int int=2; :에러
		
//		변수 선언과 사용(대입,읽기)
//		변수선언
//		변수 초기화 (선언 이후 처음으로 값 저장)
		int a; //선언 : 사용할수 없다
		a=1; // 대입
		int b=1;
		
		int c =0;
		
		c= a + b;
//		변수 초기화 하여야 메모리에 생성되고 연산에 이용 될 수 있다.
//		그래서 변수 선언시 초기화를 하는 습관 필요
		
//		정수형 : 0 실수형은 0.0 문자형은 ''또는 ""
		
	  boolean defaultNy = false; byte aa= 0; short bb = 0; int cc= 0; long dd = 0;
		  
		  float ee = 0.0f; double ff = 0.0;
		  
		 char gg = ' '; String hh = "";
		 
//	----------------------------------------------------------------	 
		
		
		 
//		 리터럴 =데이터
//		 정수형 리터럴 = 정수형데이터
//		이스케이프 문자
		System.out.println(c);
		System.out.println("donghun Han");
		System.out.println("donghun han : " + "good");
		
		
		
		
		
		
		System.out.println("한칸 들여쓰기");
		System.out.println("\t한칸 들여쓰기");
		
		
		System.out.println("한줄바꿈");
		System.out.println("\n한줄바꿈");
		
		System.out.println("한줄바꿈");
		System.out.println("\r한줄바꿈");
		
		
		
		
		System.out.println("\'나는생각한다\'");
		System.out.println("소크라테스가 말했다\"나는존재한다.\"");
		System.out.println("\'이런\'");
		
		
		//변수의 범위
		// 변수는 선언된 블럭 내에서만 사용 가능 하다.
		
		
		
		
		
		
		if (a == 1) {
			int aaa = 10;
			int bbb = aaa + a;
			System.out.println("bbb: " +bbb);
		} else {
		}
		
		
//		System.out.println("aaa: " + bbb);
//		error
		
		
		
		
		
	}

}
