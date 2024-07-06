package com.javaex.ex09;

public class StringUtil {
    
	
	//생성자
    public static String concatString(String[] a){
       
        //메소드 내용작성 
        String result = "";
        
        for(int i = 0; i<a.length; i++) {
        	result += a[i];
        }
        
        return result;
    }

}
