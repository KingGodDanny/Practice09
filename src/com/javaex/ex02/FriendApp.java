package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

    	
    	List<Friend> fList = new ArrayList<Friend>(); 
    	
         Scanner sc = new Scanner(System.in);

         
         System.out.println("친구를 3명 등록해 주세요");
         
         
             for(int i=0; i<3; i++) {
            	 
            	 //" "로 자르는 코드
            	 String list = sc.nextLine();
            	 String[] listArray = list.split(" ");
 	            
            	 
            	 String name = listArray[0];
            	 String hp = listArray[1];
            	 String school = listArray[2];
            	 
            	 
            	Friend friend = new Friend(name, hp, school);
            
            	fList.add(friend);
 	            
         		}
             
         
         // 친구정보 출력
         for (int i = 0; i < fList.size(); i++) {
             
        	 Friend f = fList.get(i);
        	 f.showInfo();
         }

         
         sc.close();
    	
    	
    }

}
