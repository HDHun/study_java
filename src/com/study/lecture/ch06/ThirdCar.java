package com.study.lecture.ch06;

public class ThirdCar {

	
	String company = "kia";
	String model = "aaa";
	String color = "black";
	int maxSpeed = 0;
	
	public ThirdCar() {
	}
	public ThirdCar(String model) {
		this(model,null,0);
	}
	
	
	public ThirdCar(String model, String color) {
		this(model, color, 0);
	}
	
	public ThirdCar(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	
	
	
	
	
	
	
	
	
}
