package com.joon.kiosk.product;

import java.util.ArrayList;
import java.util.Scanner;

public class KioskSpt {

	public static ArrayList<Order> basket = new ArrayList<>();
	public static ArrayList<Product> products = new ArrayList<>();
	public static ArrayList<Product> bake = new ArrayList<>();
	public static Scanner sc = new Scanner(System.in);
	public static String cmd;
	// 자동임포트 단축키: ctrl+shift+o(영문자O)
	
	public static void productLoad() {
		products.add(new Product("아이스 아메리카노",1000));;
		products.add(new Product("뜨거운 아메리카노", 1500));
		products.add(new Product("바닐라 라떼", 2000));
		bake.add(new Product("케이크", 6000));
		bake.add(new Product("빵", 4000));
		bake.add(new Product("마카롱", 2500));

	}
}