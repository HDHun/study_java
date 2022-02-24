package com.study.lecture.ch07;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
//		자식 프로그램 클래스

		// 객체생성 : 자식
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폼","검정",10);
		
		
		// cellphone에서 상속
		System.out.println("모엘 :" + dmbCellPhone.model);
		System.out.println("색상 :" + dmbCellPhone.color);
		
		//dmbcellphone의 필드
		System.out.println("채널 :" + dmbCellPhone.channel);
		
		//CellPhone으로부터 상속받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요 저는 홍길동인데요");
		dmbCellPhone.sendVoice("아~ 예 반갑습니다.");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		
		
		
		
		
		
		
	}

}
