package ex1_string;

import java.util.Scanner;

public class Ex1_String {
	public static void main(String[] args) {
		
		// String은 두 가지 특징을 가지고 있다.
		// 1) 객체생성 방법이 두 가지!! (암시적, 명시적)
		// 2) 한 번 생성된 문자열의 내용은 변하지 않는다 (불변의 특징)
		
	//  클래스    객체
		String s1 = "abc"; // 암시적 객체생성 (new x)
		String s2 = "abc"; 
		
		String s3 = new String("abc"); // 명시적 객체생성(new o)             
		String s4 = new String("abc"); // 명시적 객체생성(new o)             
		
		// ==은 기본자료형 끼리 비교하는 경우 값을 비교
		// 객체간의 ==는 주소값을 비교
		if ( s1 == s3 ) {
			System.out.println("주소가 같습니다.");
		}else {
			System.out.println("주소가 다릅니다.");
		}//else
		
		// String 클래스는 객체간 주소 비교 보다, 값을 비교하는 경우가 훨씬 많다.
		if ( s1.equals( s3 ) ) {
			System.out.println("값이 같습니다.");
		}
		
		System.out.println("===============================");
		
		//Scanner sc = new Scanner(System.in);
		//s3 = sc.next();
		
		//if ( s1.equals( s3 ) ) {
			//System.out.println("같습니다.");
		//}//if
		
		String greet = "안녕";
		greet += "하세요";
		System.out.println(greet);
		
		s1 = "bbb";
		s2 = "bbb";
		s2 = "ccc";
		
		
    }// main

}

































