package ex7_while;

import java.util.Random;

public class Ex2_do_while {
	public static void main(String[] args) {
		
	 // do-while문 : 선 처리 , 후 비교
	 //	제어문들 중 유일하게 ;으로 끝맺어야 한다.
	 // do {
	 //	조건식이 참일 때 실행되는 영역
	 // }while( 조건식 );
		
	 int i = 11;
	 do {
		 System.out.println(i);
		 //i++;
	} while ( i <= 10 );
	 
	 System.out.println("--------------");
	 
	 // 변수 java , jsp , android에 랜덤으로
	 // 0~130 사이의 값을 담는다	
	 // do ~ while을 통해 세 과목의 점수가 모두 0~100 사이일때만
	 // while을 빠져나와 각 과목별 랜덤 성적을 출력.
	 
	 // 결과
	 // 자바 : 92	
	 // jsp : 25	
	 // 안드 : 100
	 
	 int java = 0;
	 int jsp = 0;
	 int and = 0;
	 
	 Random ran = new Random();
	 
	 do {
		 java =ran.nextInt(131);
		 jsp = ran.nextInt(131);
		 and = ran.nextInt(131);
		
	} while (java > 100 || jsp > 100 || and > 100);
	 
	System.out.println( "자바 : " + java);
	System.out.println( "jsp : " + jsp); 
	System.out.println( "안드 : " + and);
	
	}//main
	

}




































