package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) throws IndexOutOfBoundsException {

		
		List<Goods> goodsList = new ArrayList<Goods>();
		
		String name = "";
		int price = 0;
		int count = 0;
		int countSum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("상품을 입력해주세요(종료 q)");

		
		while(true) {
			
			String list = sc.nextLine();
			
			if("q".equals(list)) {
				System.out.println("[입력완료]");
				System.out.println("==============================");
				break;
				
			}
			
			String[] listArray = list.split(",");
			
			 name = listArray[0];
			 price = (Integer.parseInt(listArray[1]));
			 count = (Integer.parseInt(listArray[2]));
			
			Goods goods = new Goods(name, price, count);
			
			goodsList.add(goods);
			
			countSum = countSum + (Integer.parseInt(listArray[2]));
			
		}
		
		for(int i=0; i<goodsList.size(); i++) {
			Goods g = goodsList.get(i);
			g.showInfo();
		}
		
		System.out.println("모든 상품의 갯수는 " + countSum + "개 입니다.");
		
		
		sc.close();
	}

}
