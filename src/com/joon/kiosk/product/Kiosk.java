package com.joon.kiosk.product;

import java.util.ArrayList;
import java.util.Scanner;

import com.joon.pack.dis.Cw;

public class Kiosk {
	ProcMenuDrink procMenuDrink = new ProcMenuDrink();

	public static ArrayList<Product> basket = new ArrayList<Product>();
	// 자동임포트 단축키: ctrl+shift+o(영문자O)
	public static Scanner sc = new Scanner(System.in);
	public static String cmd;

	void run() {
		KioskSpt.productLoad();
		Disp.title();
		xx: while (true) {
			System.out.print("메뉴를 선택 해주세요. [1.음료선택 / 2.디저트선택 / e.계산하기]:");
			cmd = sc.next();
			switch (cmd) {
			// 1을 선택했을때 proMenuDrink 안에 있는 run이라는 함수를 실행해서 음료 선택//
			case "1":
				procMenuDrink.run();
				break;
			case "2":
				Dessert.deesrt_menu();
				break;
			// 스위치문에 e를 눌렀을경우 while 문을 넣어 해당 변수들을 사용할수있게 함
			case "e":
				Cw.wn("주문 수량이 맞나 확인해주세요.");
				//ㅁㅁㅁㅁㅁㅁ//
				//상품 갯수 //
				//ㅁㅁㅁㅁㅁㅁ//
				int count = basket.size();
				Cw.wn("상품 주문 갯수는 " + count + "개 입니다");

				int sum = 0;
				for(Order o:KioskSpt.basket) {	// 향상된for문(for-each)으로 적용
					sum = sum + o.selectedProduct.price;
				}
					//ㅁㅁㅁㅁㅁㅁㅁ//
					//장바구니 목록//
					//ㅁㅁㅁㅁㅁㅁ//
					Cw.wn("===========장바구니 목록===========");
					for(Order o:KioskSpt.basket) {
						Cw.wn(o.selectedProduct.name);
					}
					Cw.wn("================================");

					System.out.println("계산하실 금액은 :" + sum + "원 입니다.");

					// 주문이 끝난 후 결제//
					loop_z: while (true) {
						Cw.wn("직원 : 결제 하시겠습니까? [현금, 카드]");
						String OrderEnd = sc.next();
						switch (OrderEnd) {
						case "현금":
							Cw.wn(sum + "원 결제 완료 되었습니다. 안녕히 가세요");
							break loop_z;

						case "카드":
							Cw.wn("잔액이 부족합니다.");
							Cw.wn("다시 결제 도와드리겠습니다.");
							break;
						}
					}

					break xx;
				}
			}
		}

	}
