package com.joon.kiosk.product;

import com.joon.pack.dis.Cw;

public class ProcMenuDrink {
	
	public void run() {
		for(Product p:KioskSpt.products) {
		Cw.wn(p.name+" "+p.price + "원");
		}
		yy:while(true) {
			//메뉴출력
			
			Cw.wn("[1.아아/2.뜨아/3.오렌지쥬스/x.이전메뉴로]");
			System.out.println("");
			Kiosk.cmd = Kiosk.sc.next();
			switch(Kiosk.cmd) {
			case "1":
				System.out.println("☆아이스 아메리카노가 선택되었습니다.☆");
				Product x = new Product("아아",1000);
				KioskSpt.basket.add(new Order(KioskSpt.products.get(0),1));
				break;
			case "2":
				Cw.wn(KioskSpt.products.get(1).name+" 선택됨");
				KioskSpt.basket.add(new Order(KioskSpt.products.get(1)));	//오더 추가
				break;
			case "3":
				System.out.println("☆바닐라 라떼가 선택되었습니다.☆");
				Product z = new Product("오렌지쥬스", 2000);
				KioskSpt.basket.add(new Order(KioskSpt.products.get(2)));
				break;
			case "x":
				System.out.println("이전 메뉴 이동");
				break yy;
			}
		}
	}
}
