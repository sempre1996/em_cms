package ex2_work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		
    // 키보드에서 입력받은 값 만큼의 행과 열을 가지는 마방진 만들기
		
	// 사이즈 : 3
		
	//08 01 06
	//03 05 07
	//04 09 02
	Scanner sc = new Scanner(System.in);
	
	int [][]arr;
	int num = 1;
	int y = 0;
	int x = 0;
	
	System.out.print("사이즈 : ");
	int size = sc.nextInt();
	
	x = size / 2;
	
	// 배열의 크기
	arr = new int[size][size];
	
	// 마방진을 그릴 while문
	
	while ( num <= size * size ) {
		 
		arr[y][x] = num;
		
		if ( num % size == 0) {
			y++;
			
		}else {
			
			y--;
			x++;
			
		}// else
		
		if ( y < 0 ) {
			y = size - 1;
			
		}// if
		
		if ( x >= size ) {
			x = 0;
		}// if
		num++;
		
	}// while
	
	// arr 배열에 담긴 모든 값을 화면에 출력
	
	for (int i = 0; i < size; i++) {
		for (int j = 0; j < size; j++) {
			System.out.printf("%02d ", arr[i][j]);
		}//inner
		System.out.println();
	 }//outer
	
   }//main
	
}



































