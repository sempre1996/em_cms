package ex4_work;

import java.util.Scanner;

public class UpdownMain {
	public static void main(String[] args) {
		
		// 1~ 50 사이의 난수를 발생시킨다.
		// 메인클래스에서 정수값을 입력받는다
		// 입력받은 값이 up , down, 정답인지를 판단
		// 정답일 경우 main클래스의 while문을 빠져나가도록 처리
		
		// 숫자 : 30
		// down
		// 숫자 : 15
		// up
		// 숫자 : 25
		// 3회만에 정답!!
		//Updown ud = new Updown();
		//Scanner sc = new Scanner(System.in);
		
		
		//while (ud.result) {
			//System.out.print("숫자 : ");
			//int me = sc.nextInt();
			//ud.check(me);
			//System.out.println("====================");
		//}//while
		
		Scanner sc = new Scanner(System.in);
		Updown ud = new Updown();
		
		while (true) {
			
		
		System.out.println("숫자 : ");
		int n = sc.nextInt();
		boolean res = ud.checkResult(n);
		
		if ( res == true ) {
			// 정답을 맞힌 경우
		 break; // while 문을 빠져나간다.
		}//if
		
	   }// while
		
		
		
		
		
		
		
	}// main

}
