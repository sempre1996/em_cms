package ex2_string;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {
		// 회문수 판단하기
		// 회문수란 앞으로 읽어도 뒤에서 읽어도 똑같이 읽히는 숫자
		// 121 abba 
		
		// 값 : a1221a
		// a1221a 는 회문수 입니다.
		
		// 값 : abc
		// abc 는 회문수가 아닙니다.
		
     
     String rev = "";
     
     System.out.print("값 : ");
     Scanner sc = new Scanner(System.in);
     String str = sc.next(); // 원본 값
     
     for (int i = str.length()-1; i >= 0; i--) {
		rev += str.charAt(i); 
	 }// for
		
	 if (str.equals(rev)) {
		System.out.println(str + "은(는) 회문수 입니다.");
	}else {
		System.out.println(str + "은(는) 회문수가 아닙니다.");
	}// else
		
	
		
		
	
	}//main
		
}


