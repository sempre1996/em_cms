package ex3_work;

import java.util.Random;

public class Ex2_lotto {
	public static void main(String[] args) {
		
		// 1 ~ 45사이의 중복되지 않는 난수 6개를 만들어 lotto배열에 담고
		// 최종적으로 lotto배열에 담긴 값들을 출력하시오.
		
		// ex) 15 2 41 17 6 9
		
		int[] lotto = new int[6];
		Random rnd = new Random();
		
	outer :	for (int i = 0; i < lotto.length;) {
			lotto[i] = rnd.nextInt(45)+1; 
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					continue outer;
				}
			}// inner
			System.out.print(lotto[i] + " ");
			i++;
		}//outer
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}






















