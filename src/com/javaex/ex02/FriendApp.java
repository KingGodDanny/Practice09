package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

    	
    	ArrayList<Friend> fList = new ArrayList<Friend>(); 
    	
         Scanner sc = new Scanner(System.in);

         
         System.out.println("친구를 3명 등록해 주세요");
         
         
             for(int i=0; i<3; i++) {
            	 
            	 
            	 String list = sc.nextLine();
            	 String[] listArray = list.split(" ");
 	            
            	Friend f01 = new Friend(listArray);
            	
            	fList.add(f01);
            	
 
 	          
 	            
 	            
         		}
             
               
         
         // 친구정보 출력
         for (int i = 0; i < fList.size(); i++) {
             
        	 Friend f = fList.get(i);
        	 f.showInfo();
         }

         
         sc.close();
    	
    	
    }

}
