package ex1_scanner;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		
		// 키보드에서 n1과 n2변수에 각각 정수값을 입력 받는다
		// n1부터 n2까지의 합을 출력.
		
		// 수1 : 2
		// 수2 : 5
		// 결과 : 14
		
		// 수1 : 5
		// 수2 : 1
		// 결과 : 15
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수1 : ");
		int n1 = sc.nextInt();
		
		System.out.print("수2 : " + n1);
		int n2 = sc.nextInt();
		int result = 0;
		
		// 변수간의 값 교환
		if ( n1 > n2 ) {
			int n3 = n1;
			n1 = n2;
			n2 = n3;
		}// if
		
		for (int i = n1; i <= n2; i++) {
			result += i;
		}//for
		
		System.out.println("결과 : " + result);
		
		//System.out.print("문장 : ");
		//String str = sc.next();
		//System.out.println("결과 : " + str);
		
		
		
		
		
		
		
	}//main

}








































