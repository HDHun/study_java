package com.study.lecture.ch02;

public class OperationsPromotionExample {

	public static void main(String[] args) {
		
		
		
		
		// 형이 틀린 경우에는 큰 형으로 자동 형변환
		int a = 10;
		double b = 10.0;
//		int c = (a+b); //Type mismatch: cannot convert from double to int
		int d = (int) (a+b);

		
		double e = a+b;
		
		
		
		
		//정수형 연산은 int로 자동 형변됨 long은 예외
		
				byte byteValue1 = 10; 
				byte byteValue2 = 20;
//		byte byteValue3 = byteValue1 + byteValue2 //컴파일에러 
				int intValue1 = byteValue1 + byteValue2;
				System.out.println("intValue1 :" + intValue1);
//		char 는 int와 연산이 되면 자동으로 int로 형변환이 되어 연산 가능
				char charValue1 = 'A';
				char charValue2 = 1;
				int intValue2 = charValue1 + charValue2;
				System.out.println("유니코드: " + intValue2);
				System.out.println("출력문자: " + (char)intValue2);
				
				int intValue3 = 10;
				int intValue4 = intValue3/4;
				System.out.println("intValue4: " + intValue4);
		
				
				int intValue5 = 10;
//				int intvalue6 = 10/4 :컴파일에러
				double doubleValue = intValue5/ 4.0;
				System.out.println("doubleValue: " + doubleValue);
	}

}
