package ex1_multi_array;

public class Ex4_multi_array {
	public static void main(String[] args) {
		
		// 2���� �迭 arr�� ��� ��� ���� �հ� ����� ���.
		// �� �� : 110
		// ��� : 8.4
		
		int[][] arr = { {2, 4, 11, 28},
			            {5, 7, 10},   
			            {12, 17, 3, 6},		
			            {3, 2} };
		
		 
		int sum = 0;
	    float avg , num = 0;
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum +=arr[i][j];
				num++;
			}// inner
			
	    }//outer
		
		avg = sum / num;
		System.out.println("���� : " + sum);
		System.out.printf("��� : %.1f", avg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}// main

}
