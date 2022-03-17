package com.urdomain.lecture.exam;

public class RemoteControlExample {

	public static void main(String[] args) {

		int volume = 100;
		
		RemoteControl remoteControl = new Television();
		
		remoteControl.turnOn();
		remoteControl.setMute(true);
		remoteControl.setMute(false);
		remoteControl.setVolume(volume);
		RemoteControl.changeBattery();
		remoteControl.turnOff();
		System.out.println();
		
		int volume2 = -10;
		
		remoteControl.turnOn();
		remoteControl.setMute(true);
		remoteControl.setMute(false);
		remoteControl.setVolume(volume2);
		RemoteControl.changeBattery();
		remoteControl.turnOff();
		

	}

}
