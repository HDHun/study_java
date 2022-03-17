package com.urdomain.lecture.ch08;

public interface RemoteControl {

	
	
	public String name = "Toy";
	// 상수
	int MAX_VOLUME = 10; // public static final 생략되어 있음
 	int MIN_VOLUME = 1;
	
	// 추상메소두 : 구현클래스에서 무족건 오버라이드 해야한다
	public abstract void turnOn(); //public abstract
	void turnOff();
	void setVolume(int volume);
	// 디폴트 메소드 : public 생략가능
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음");
		} else {
			System.out.println("무음해제");
		}
	}
	
	// 정적 메소드 : public 생략가능
	public static void changeBattery() {
		System.out.println("건전지 교체");
	}
}	