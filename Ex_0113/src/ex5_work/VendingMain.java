package ex5_work;

import java.util.Scanner;

public class VendingMain {
    public static void main(String[] args) {
	// Ű���忡�� �ݾ��� �Է¹ް� 
    // �ش� �ݾ� ���� �ȿ��� ���� �� �ִ� ������ ��ϸ� ȭ�鿡 ���
    // ���Ḧ �����ϸ� ���� �� �ܾ��� ��ȯ	
    	
    	
    // insert coin : 1000
    // fanta - 1000
    // coke -900	
    // sider - 900	
    // >> coke 
    // coke(��)�� �����ϼ̽��ϴ�.
    // �ܾ� : 100��
    	Vending vc = new Vending();
    	Scanner sc = new Scanner(System.in);
    	
    	vc.init();
    	
    	System.out.println("�ݾ��� �Է��ϼ���");
    	int money = sc.nextInt();
    	
    	vc.showCans(money);
    	System.out.println("���Ḧ �����ϼ���");
    	String name = sc.next();
    	
    	vc.outCan(name);
    	
    	
    	
    	
    	
    	
    	
    	
	}//main
}
