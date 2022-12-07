package com.joon.kiosk.product;

import com.joon.pack.dis.Cw;

public class ProcMenuDrink {
	
	public void run() {
		for(Product p:KioskSpt.products) { //product 의 값은 (String(이름), int(가격))로 설정해두었음
		Cw.wn(p.name+" "+p.price + "원");
		}
		yy:while(true) {
			//메뉴출력
			
			Cw.wn("[1.아이스 아메리카노 / 2.뜨러운 아메리카노 / 3. 바닐라 라떼 / x.이전메뉴로]");
			System.out.println("");
			Kiosk.cmd = Kiosk.sc.next();
			switch(Kiosk.cmd) {
			case "1":
				Cw.wn("☆아이스 아메리카노가 선택되었습니다.☆");
				Product x = new Product("아아",1000);
				KioskSpt.basket.add(new Order(KioskSpt.products.get(0)));
				break;
			case "2":
				Cw.wn("☆뜨거운 아메리카노가 선택되었습니다.☆");
				Product y = new Product("뜨거운 아메리카노", 1500);
				KioskSpt.basket.add(new Order(KioskSpt.products.get(1)));	//오더 추가
				break;
			case "3":
				Cw.wn("☆바닐라 라떼가 선택되었습니다.☆");
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
