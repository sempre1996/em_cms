package ex2_work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		
    // Ű���忡�� �Է¹��� �� ��ŭ�� ��� ���� ������ ������ �����
		
	// ������ : 3
		
	//08 01 06
	//03 05 07
	//04 09 02
	Scanner sc = new Scanner(System.in);
	
	int [][]arr;
	int num = 1;
	int y = 0;
	int x = 0;
	
	System.out.print("������ : ");
	int size = sc.nextInt();
	
	x = size / 2;
	
	// �迭�� ũ��
	arr = new int[size][size];
	
	// �������� �׸� while��
	
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
	
	// arr �迭�� ��� ��� ���� ȭ�鿡 ���
	
	for (int i = 0; i < size; i++) {
		for (int j = 0; j < size; j++) {
			System.out.printf("%02d ", arr[i][j]);
		}//inner
		System.out.println();
	 }//outer
	
   }//main
	
}



































