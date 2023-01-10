package ex2_coin;

import java.util.Random;

public class Ex1_coin {
	public static void main(String[] args) {
		
	// 변수 money에 10~ 5000까지의 난수를 만들어 넣는다.
    // 단, 1의 자리 숫자는 반드시 0으로 만들어 지도록 한다.
	// 발생된 난수 money를 동전으로 바꿨을 때,
	// 500원 , 100원 , 50원 , 10원짜리 동전이 각각 몇개 거슬러지는지 판단하는 코드를 구현
	// 단, 가능한 한 적은 수의 동전으로 거슬러 줄 것.
		
	// 금액 : 2590 
    // 500원 : 5
	// 50원 : 1	
	// 10원 : 4	
		
		int[] coin = {1000, 500 , 100 , 50 , 10};
		Random ran = new Random();
		
		int money = ran.nextInt(1000) + 1;
		money *= 10;
		
		System.out.printf("[ %d 원 ]\n" , money );
		
		for (int i = 0; i < coin.length; i++) {
			int result = money / coin[i];
			
			if ( result > 0 ) {
				System.out.printf("%d원 %d개\n" , coin[i] , result);
				money %= coin[i];
				
			}// if 
			
		}// for 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}





































