package com.study.lecture.ch03;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {	
//	++ : 1증감
//	-- : 1감소
	
//	++x; : 피연산자를 1 증가시키고 다른연산 수행
//	x++; : 다른 연산 수행 후 피연산자 1 증가
//  다른 연산자가 없으면 앞에 있나 뒤에 있나 결과 같음	
	
		int x = 10;	
		int y = 10;
		int z;
		
		
		
		++x;
		++x;
		y--;
		--y;

		System.out.println("y=" + y);
		
		z = x++;
		z= ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
//		z= ++x + y++; 14 8
//		System.out.println("z=" + z); 15 8
//		System.out.println("x=" + x); 15
//		System.out.println("y=" + y); 9
		
	}

}
