package com.joon.kiosk.product;

import com.joon.pack.dis.Cw;

public class Disp {
	//일반 변수.
	String x = "x";
	
	////	static 변수	////
	//final 키워드를 붙이면 변수가 상수가 됨. 처음에 값이 들어가면 이후 값을 못 바꿈.
	//상수 명명 국룰 = 이름을 다 대문자로 씀.
	final static String DOT = "★";	
	final static int DOT_COUNT = 48;
	public static void line() {
//		Cw.w(x);	// 일반 멤버 변수는 못씀.
		for(int i=0;i<DOT_COUNT;i=i+1) {
			Cw.w(DOT);	// static 멤버 변수는 사용 가능.
		}
		Cw.wn("");
	}
	
	public static void title() {
		line();
		Cw.wn("직원 : 어서오세요 주문은 키오스크에서 진행해주세요");
		line();
	}

}
