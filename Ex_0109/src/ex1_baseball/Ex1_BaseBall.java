package ex1_baseball;

import java.util.Random;
import java.util.Scanner;

public class Ex1_BaseBall {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		int com1, com2, com3;
		int u1, u2 , u3;
		
		do {
			// 중복되지 않는 세 개의 난수를 만들자!! (do -while문)
			com1 = rnd.nextInt(9) + 1;
			com2 = rnd.nextInt(9) + 1;
			com3 = rnd.nextInt(9) + 1;
			
			
		} while ( com1 == com2 || com1 == com3 || com2 == com3  );
		
		System.out.println("정답 : " + com1 + com2 + com3);
		
		int count = 0;
		
		while (true) {
			
			count++;
		
		
		// 정답이라고 생각하는 세 자리의 수를 입력받는다
		System.out.print("수1 : ");
		u1 = sc.nextInt();
		
		System.out.print("수2 : ");
		u2 = sc.nextInt();
		
		System.out.print("수3 : ");
		u3 = sc.nextInt();
		
		
	    // 스트라이크와 볼 갯수를 저장할 변수
		
		int strike = 0;
		int ball = 0;
		
		// 정답처리를 위한 경우의 수
		if (u1 == com1) {
             strike++;
        }else if( u1 == com2 || u1 == com3) {
			ball++;
		}// else if
		
		if (u2 == com2) {
            strike++;
        }else if( u2 == com1 || u2 == com3) {
			ball++;
		}// else if
		
		if (u3 == com3) {
            strike++;
        }else if( u3 == com1 || u3 == com2) {
			ball++;
		}// else if
		
		// 정답처리
		if ( strike == 3) {
			System.out.println(count + "회 만에 정답!!");
			  break; // 정답을 맞힌 경우 while문을 탈출!!
			  
		}else {
			if ( strike == 0 && ball == 0) {
				// out을 판단하는 if문
				System.out.println("out!!");
			}else {
				// out이 아닌경우 strike와 ball갯수를 보여준다.
				System.out.printf("%dstrike, %dball\n" , strike ,ball);
			}// else
			
		}// else
		
		
		System.out.println("===============================");
		
		
		
		
	    }// while

    }// main 
}






























