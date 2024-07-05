package com.javaex.ex6_1;

import com.javaex.ex06.CConverter;

public class CConverterApp {

	public static void main(String[] args) {

		double dollar;
		double won;
		
		 CConverter.setRate(1118.70);
		 
		 dollar = CConverter.toDoller(1000000.0);
		 won = CConverter.toKWR(100.0);
			
		 System.out.println(dollar);
		 System.out.println(won);
	}

}
