package ex2_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		
		// 키보드에서 입력받은 값 만큰 피보나치 수열 출력하기
		
		// 입력 : 5
		// 1 1 2 3 5 8 13 21
  		
		Scanner sc = new Scanner(System.in);
		int n1 = 1;
		int n2 = 0;
		System.out.print("입력 : ");
		
		int ss = sc.nextInt();
		
		for (int i = 0; i < ss; i++) {
			int n3 = n1 + n2;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;
		}
		
	}// main

}





























