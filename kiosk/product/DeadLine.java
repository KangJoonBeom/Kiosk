package com.joon.kiosk.product;

import com.joon.pack.dis.Cw;

public class DeadLine {

	public static void Line(){
		Cw.wn("직원 : 주문 수량이 맞나 확인해주세요.");
		//상품 갯수 //
		int count = KioskSpt.basket.size();
		Cw.wn("상품 주문 갯수는 " + count + "개 입니다");

		int sum = 0;
		for(Order o:KioskSpt.basket) {
			sum = sum + o.selectedProduct.price;
		}
			//장바구니 목록//
			Cw.wn("===========장바구니 목록===========");
			for(Order o:KioskSpt.basket) {
				Cw.wn(o.selectedProduct.name);
			}
			Cw.wn("================================");

			System.out.println("계산하실 금액은 :" + sum + "원 입니다.");
	loop_z: while (true) {
		Cw.wn("직원 : 결제 하시겠습니까? [현금, 카드]");
		String OrderEnd = Kiosk.sc.next();
		switch (OrderEnd) {
		case "카드":
			Cw.wn("잔액이 부족합니다.");
			Cw.wn("다시 결제 도와드리겠습니다.");
			break;
			
		case "현금":
			Cw.wn(OrderEnd + "원 결제 완료 되었습니다. 안녕히 가세요");
			break loop_z;
		}
	}
}
	
}
