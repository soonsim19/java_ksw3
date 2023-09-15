package p0914;

import java.util.ArrayList;

public class Buyer {
	Buyer(){}
	Buyer(String id, String name){
		this.id =id;
		this.name=name;
	}
	
	
	String id;
	String name;
	int money=10000000;
	int bonusPoint =0;
	//컬렉션 선언
	ArrayList list = new ArrayList();
	
	
	
	int buy(Product p) {
		//
		if(money>p.price) {
			System.out.println("잔액이 부족하여 구매 불가");
			System.out.println();
			return 0;//구매 실패
		}
			
		money-=p.price;
		bonusPoint +=p.bonusPoint;
        list.add(p);
        return 1;//구매 성공
        
	}

}
