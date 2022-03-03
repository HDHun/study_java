package com.urdomain.lecture.ch04;

public class IfElseIfElseExample {

	public static void main(String[] args) {


		
		int score = 55;
		
		if(score >=90) {
			System.out.println("점수가 100~90 사이 입니다.");
			System.out.println("등급은 a입니다.");
		
		}	else if (score >=80) {
			System.out.println("점수가 80~89 사이 입니다.");
			System.out.println("등급은 b입니다.");
		}	else if (score >=70) {
			System.out.println("점수가 70~79 사이 입니다.");
			System.out.println("등급은 c입니다.");
		}	else if (score >=60) {
			System.out.println("점수가 60~69 사이 입니다.");
			System.out.println("등급은 d입니다.");
			
		}	else {
			System.out.println("점수가 60미만 입니다.");
			System.out.println("등급은 f입니다.");
			
		}




	int a = 10;
	int b = 20;
	
	if(a > b) {
		System.out.println(">");
	} else if (a < b) {
		System.out.println("<");
	} else {
		System.out.println("==");
		
	}



	}

}
