 package com.javaex.ex06;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        
       
        
        CConverter.setRate(1118.70);
        
        dollar = CConverter.toDoller(1000000.0);
        won = CConverter.toKWR(100);
        //100만원을 달러로 출력하기
        System.out.println(dollar);
        
        System.out.println(won);
        //100달러를 원으로 출력하기
        
    }

}
