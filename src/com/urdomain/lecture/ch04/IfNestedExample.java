package com.urdomain.lecture.ch04;

public class IfNestedExample {

	public static void main(String[] args) {

		int score = 50;
		String grade = "";

		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		}

		if (score < 90) {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}

		if (score < 80) {
			if (score >= 75) {
				grade = "C+";
			} else {
				grade = "C";
			}
		}

		if (score < 60) {
			if (score >= 65) {
				grade = "D+";
			} else {
				grade = "D";

			}
		}

		if (score < 59) {
			grade = "F";
		}
		System.out.println("grade:" + grade);


		int x = -10;
		int y = 10;
		
		if (x >=0) {
			if (y >=0) {
				System.out.println(1);
			} else {
				System.out.println(4);
			}
					}
			else  (x < 0) {
			if (y < 0) {
					System.out.println(3);
			} else {
				System.out.println(2);	
			}
			
						}


		}
	}


