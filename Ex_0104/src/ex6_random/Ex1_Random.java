package ex6_random;

import java.util.Random;

public class Ex1_Random {
	public static void main(String[] args) {
		
		
		// ������ ����� �ִ� Ŭ���� Random
		Random rnd = new Random();  // ctrl + shift + o
		
		// 12345 ~ 34567 ������ ����
		// rnd.nextInt( ������ ����)  + ���� ��;
		// rnd.nextInt( �� �� - ���� �� + 1)  + ���� ��;
		
		int num = rnd.nextInt( 34567 - 12345 + 1 ) + 12345;
		System.out.println(num);
		
		System.out.println("-----------------------------");
		// A ~ Z ������ ���ĺ��� �������� ��µǵ��� �ϼ���
		// ����� ���� : H 
		
		int b = rnd.nextInt('Z' -'A' + 1)+ 'A';
		System.out.println((char)b);
		
	}//main

}












































