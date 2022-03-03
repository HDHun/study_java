package com.urdomain.lecture.ch04;

public class SwitchExample {

	public static void main(String[] args) {
		// Math.random() : 0.0~1.0에 가까운 double 형 값을 보내줌
		//Math.random() *(max - min + 1) + min;
		
		
		int num = (int) (Math.random() *(6 - 1 + 1) + 1);
		int num2 = (int) (Math.random() *(6 - 1 + 1) + 1);
		switch (num) {
		case 1:
			System.out.println("첫번째 주사위는 1번 입니다.");
			break;
		case 2:
			System.out.println("첫번째 주사위는 2번 입니다.");
			break;
		case 3:
			System.out.println("첫번째 주사위는 3번 입니다.");
			break;
		case 4:
			System.out.println("첫번째 주사위는 4번 입니다.");
			break;
		case 5:
			System.out.println("첫번째 주사위는 5번 입니다.");
			break;
		case 6:
			System.out.println("첫번째 주사위는 6번 입니다.");
			break;
		default:
			System.out.println("0");
			break;
		}
		switch (num2) {
		case 1:
			System.out.println("두번째 주사위는 1번 입니다.");
			break;
		case 2:
			System.out.println("두번째 주사위는 2번 입니다.");
			break;
		case 3:
			System.out.println("두번째 주사위는 3번 입니다.");
			break;
		case 4:
			System.out.println("두번째 주사위는 4번 입니다.");
			break;
		case 5:
			System.out.println("두번째 주사위는 5번 입니다.");
			break;
		case 6:
			System.out.println("두번째 주사위는 6번 입니다.");
			break;
		default:
			System.out.println("0");
			break;
		}
		System.out.println("두 수의 합은 " + ( num + num2 ) + " 입니다.");
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
