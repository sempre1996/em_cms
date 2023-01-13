package ex5_work;

import java.util.Scanner;

public class VendingMain {
    public static void main(String[] args) {
	// 키보드에서 금액을 입력받고 
    // 해당 금액 범위 안에서 마실 수 있는 음료의 목록만 화면에 출력
    // 음료를 선택하면 제공 및 잔액을 반환	
    	
    	
    // insert coin : 1000
    // fanta - 1000
    // coke -900	
    // sider - 900	
    // >> coke 
    // coke(을)를 선택하셨습니다.
    // 잔액 : 100원
    	Vending vc = new Vending();
    	Scanner sc = new Scanner(System.in);
    	
    	vc.init();
    	
    	System.out.println("금액을 입력하세요");
    	int money = sc.nextInt();
    	
    	vc.showCans(money);
    	System.out.println("음료를 선택하세요");
    	String name = sc.next();
    	
    	vc.outCan(name);
    	
    	
    	
    	
    	
    	
    	
    	
	}//main
}
