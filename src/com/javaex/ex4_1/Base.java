package com.javaex.ex4_1;

public class Base {
	//필드
	
	//생성자
	
	//메서드 gs
	
	//메서드
	public void service(String state) {
		if(state.equals("낯")) {
			day();
		}else if(state.equals("밤")) {
			night();
		}else if(state.equals("저녁")) {
			afternoon();
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
			
	}
	
	public void day() {
		System.out.println("낯에는 수업을 열심히 듣자");
	}
	public void night() {
		System.out.println("밤에는 숙면");
	}
	public void afternoon() {
		System.out.println("오후도 마찬가지로 공부를 해야합니다.");
	}
}
