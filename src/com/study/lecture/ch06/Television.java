package com.study.lecture.ch06;

public class Television {

	public static String company = "Samsung";
	public static String model = "OLED";
	public static String info;
	public static String desc = company + model ;
	public String a = "aaa";
	
	static {
		info = company + model;
// a 못들어감 : static선언 안해서
	}
	
	
}
