package ex6_random;

import java.util.Random;

public class Ex1_Random {
	public static void main(String[] args) {
		
		
		// 난수를 만들어 주는 클래스 Random
		Random rnd = new Random();  // ctrl + shift + o
		
		// 12345 ~ 34567 사이의 난수
		// rnd.nextInt( 난수의 범위)  + 시작 수;
		// rnd.nextInt( 끝 수 - 시작 수 + 1)  + 시작 수;
		
		int num = rnd.nextInt( 34567 - 12345 + 1 ) + 12345;
		System.out.println(num);
		
		System.out.println("-----------------------------");
		// A ~ Z 사이의 알파벳이 랜덤으로 출력되도록 하세요
		// 결과를 문자 : H 
		
		int b = rnd.nextInt('Z' -'A' + 1)+ 'A';
		System.out.println((char)b);
		
	}//main

}












































