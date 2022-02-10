package com.study.lecture.ch04;

public class IfNestedExample {

	public static void main(String[] args) {


		
		int score = 98;
		String grade = "";
		
		if(score >= 90) {
			if(score >=95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		}
		
		if(score >= 80) {
			if(score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		
		if(score >= 70) {
			if(score >= 75) {
				grade = "C+";
			} else {
				grade = "C";
			}
		}
		
		if(score >= 60) {
			if(score >= 65) {
				grade = "D+";
			} else {
				grade = "D";
				
			}s
			System.out.println("grade:" +grade);
		}
		
		
		

	}

}
