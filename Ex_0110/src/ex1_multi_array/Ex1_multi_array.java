package ex1_multi_array;

public class Ex1_multi_array {
	public static void main(String[] args) {
		
	  // 다차원 배열
	  // 1차원 배열이 2개 모여 있으면 2차원 배열
	  // 1차원 배열이 3개 모여 있으면 3차원 배열 ( 많이 쓰이지는 않는다!!)	
		
		int[][] test = new int[2][3];
		test[0][0] = 10;
		test[0][1] = 20;
		test[0][2] = 30;
		
		test[1][0] = 40;
		test[1][1] = 50;
		test[1][2] = 60;
		
	
		System.out.println(test[1][1]);
		
		System.out.println("============================");
		
		// 2차원 배열 test의 모든 값을 출력해보자!!
		// test.length -> 큰 방의 갯수
		// test[i].length -> 각 큰 방에 포함되어 있는 작은 방의 갯수
		
		for (int i = 0; i < test.length; i++) {
			
			for (int j = 0; j < test[i].length; j++) {
				System.out.printf("%d ", test[i][j]);
				
			}// inner
			System.out.println();
		}// outer
		
		
	}// main

}










































