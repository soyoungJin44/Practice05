package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");
       
        /*
       Friend a = new Friend();
       Friend b = new Friend();
       Friend c = new Friend();
       
       friendArray[0] = a;
       friendArray[1] = b;
       friendArray[2] = c;
        */
        
        for(int i=0; i<friendArray.length; i++) {
    		friendArray[i] = new Friend();
        	
    		System.out.print("이름: ");
        	friendArray[i].setName(sc.nextLine());
        	//String name = sc.nextLine();
        	System.out.print("핸드폰: ");
        	friendArray[i].setHp(sc.nextLine());
        	//String hp = sc.nextLine();
        	System.out.print("학교: ");
        	friendArray[i].setSchool(sc.nextLine());
        	//String school = sc.nextLine();
        	/*
        	friendArray[i].setName(name);
        	friendArray[i].setHp(hp);
        	friendArray[i].setSchool(school);
        	*/
        	
        } //for
       
        
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
        	friendArray[i].showInfo();
        }

        sc.close();
    }

}
