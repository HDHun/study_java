package com.urdomain.lecture.Function;

public class Function {


private static void println(int add) {
		// TODO Auto-generated method stub
		
	}
//		public 리턴자료형 메소드형 ( 입력자료형1 입력변수1, 입력자료형2 입력변수2, .args)
//			...
//			return 리턴값; // 리턴자료형이 void인 경우에는 return문이 필요없다.
		
		// 함수 선언
		public static int add (int a, int b) {
			int sum = a + b;			
			return sum;
		}
	
		public static int minus(int a, int b) {
			int result = a-b;
			return result;
					
		}
		public static int X(int a, int b) {
			int result1 = a*b;
			return result1;
			
		}
		public static int divide(int a, int b) {
			int result2 = a/b;
			return result2;
			
		}
		
	
		public static void main(String[] args) {
			
//			함수의 사용
			int sum = add(3,4);
			System.out.println(sum);
			
			println(add(3,4));
			println(minus(3,4));
			
		}
		
		
		
		public int aaa (int a, int b, int c, String d, boolean e) {
			System.out.println(a);
			return 1;
		}
	
//		boolean
//		byte
//		short
//		int
//		long
//		float
//		double
//		
		
		
		
	
		
		
		
		public static int[] allInOne(int a, int b) {
			int sum = 0;
			int[] sum2 = new int[5];
			sum2[0] = a + b;
			sum2[1] = a-b;
			sum2[2] = a*b;
			sum2[3] = a/b;
			sum2[4] = a%b;
			
			return sum2;
//			for(int a : allInOne(6, 3)) {
//				System.out.println(a);
//			}
		}
	}

	
	
	
	
	

