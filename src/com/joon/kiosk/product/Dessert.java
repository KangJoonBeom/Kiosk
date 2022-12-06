package com.joon.kiosk.product;

import com.joon.pack.dis.Cw;

public class Dessert {

// ctl+shfit+r 한방에 바꾸기
		public static void deesrt_menu() {
			for(Product p:KioskSpt.bake) {
				Cw.wn(p.name+" "+p.price + "원");
				}
		loop_b: while (true) {
//			Kiosk.b1.info();
//			Kiosk.b2.info();
//			Kiosk.b3.info();
			
			
			System.out.println("디저트가 선택되었습니다. [1. 케이크 2. 빵 3. 마카롱 x. 뒤로가기]");
			System.out.println("");
			Kiosk.cmd = Kiosk.sc.next();
			switch (Kiosk.cmd) {
			case "1":
				System.out.println("☆케이크가 선택 되었습니다.☆");
				Product a = new Product("케이크", 6000);
				KioskSpt.basket.add(new Order(KioskSpt.bake.get(0)));
				break;
			case "2":
				System.out.println("☆빵이 선택 되었습니다.☆");
				Product b = new Product("빵", 4000);
				KioskSpt.basket.add(new Order(KioskSpt.bake.get(1)));
				break;
			case "3":
				System.out.println("☆마카롱이 선택 되었습니다.☆");
				Product c = new Product("마카롱", 2500);
				KioskSpt.basket.add(new Order(KioskSpt.bake.get(2)));
				break;
			case "x":
				break loop_b;
			}
		}
	}

}
