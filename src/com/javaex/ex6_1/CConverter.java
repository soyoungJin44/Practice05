package com.javaex.ex6_1;

public class CConverter {
	//필드
	
	//생성자
	public static double rate;
	
	//메서드 gs
	
	
	public static void setRate(double rate) {
		CConverter.rate = rate;
	}
	public static double toDollar(double won) {
		return won/rate;
	}
	public static double toKWR(double dollar) {
		return dollar*rate;
	}
	//메서드 일반
	
}
