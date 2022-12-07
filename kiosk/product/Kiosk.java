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
			// 1을 입력 했을때 procMenuDrink 클래스 안에있는 run의 함수를 실행시킴
			case "1":
				procMenuDrink.run();
				break;
			case "2":
				Dessert.deesrt_menu();
				break;
			// 스위치문에 e를 눌렀을경우 while 문을 넣어 해당 변수들을 사용할수있게 함
			case "e":

				
					// 주문이 끝난 후 결제//
					DeadLine.Line();
					
					break xx;
				}
			}
		}

	}
