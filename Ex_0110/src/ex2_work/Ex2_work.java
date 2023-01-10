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
	int x = sc.nextInt();
	
	int[][] m = new int[x][x];
	
	int i = 0;
	int j = x / 2;
	
	for (int a = 0; a <= x * x; a++) {
		m[i][j] = a;
		if ( a % x != 0) {
			if (i == 0) {
				i = x - 1;
			}else {
				i--;
			}// else 
			if (j == x - 1) 
				j = 0;
			else 
				j++;
		 }  else { if (i == x - 1) {
				   i = 0;
			}else 
				i++;
			}
				
			
		}// out if
		for (int k = 0; k < m.length; k++) {
			for (int k2 = 0; k2 < m[k].length; k2++) {
				 System.out.printf("%02d ",m[k][k2]);
			}
			System.out.println();
		}
		
		
	}//for
	
	}// main





































