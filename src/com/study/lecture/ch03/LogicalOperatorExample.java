package com.study.lecture.ch03;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		
		
		
		int charCode = 'A'; //65
		
//		&& = &  : and 연산 : 참 참 참, 나머지 폴스
//		|| = |  : or 연산 : 참 폴스 참, 폴스 참 참, 참 참 참, 폴스 폴스 폴스
		
		
		if( (charCode>=65) & (charCode<=90) ) {
		System.out.println("대문자 이군요");

		}
		if( (charCode>=96) && (charCode<=122) ) {
			System.out.println("소문자 이군요");
			
		}
		if( !(charCode>=48) && !(charCode<=57) ) {
			System.out.println("0~9 숫자  이군요");
			
		}
		if( (charCode>=65) | (charCode<=90) ) {
			System.out.println("대문자 이군요");
			
		}
		if( (charCode>=96) || (charCode<=122) ) {
			System.out.println("소문자 이군요");
			
		}
		if( !(charCode>=48) || !(charCode<=57) ) {
			System.out.println("0~9 숫자  이군요");
			
		}
		
		
		
		int value = 6;
		
		if ( (value%2==0) | (value%3==0)) {
			System.out.println("2 또는 3의 배수이군요");
			
		}
		
		if ( (value%2==0) || (value%3==0)) {
			System.out.println("2 또는 3의 배수이군요");
			
		}
		
		
		
		
		
		
	}

}
