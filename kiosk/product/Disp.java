package com.joon.kiosk.product;

import com.joon.pack.dis.Cw;

public class Disp {
	String x = "x";
	
	////	static 변수	////
	//final 키워드를 붙이면 변수가 상수가 됨. 처음에 값이 들어가면 이후 값을 못 바꿈.
	//상수 명명 국룰 = 이름을 다 대문자로 씀.
	
	
	// 키오스크를 실행 할때 가장 먼저 실행//
	final static String DOT = "★";	
	final static int DOT_COUNT = 48;
	public static void line() {
		for(int i=0;i<DOT_COUNT;i=i+1) {
		}
		Cw.wn("");
	}
	
	public static void title() {
		line();
		Cw.wn("직원 : 어서오세요 주문은 키오스크에서 진행해주세요");
		line();
	}

}
