package ex2_coin;

import java.util.Random;

public class Ex1_coin {
	public static void main(String[] args) {
		
	// ���� money�� 10~ 5000������ ������ ����� �ִ´�.
    // ��, 1�� �ڸ� ���ڴ� �ݵ�� 0���� ����� ������ �Ѵ�.
	// �߻��� ���� money�� �������� �ٲ��� ��,
	// 500�� , 100�� , 50�� , 10��¥�� ������ ���� � �Ž��������� �Ǵ��ϴ� �ڵ带 ����
	// ��, ������ �� ���� ���� �������� �Ž��� �� ��.
		
	// �ݾ� : 2590 
    // 500�� : 5
	// 50�� : 1	
	// 10�� : 4	
		
		int[] coin = {1000, 500 , 100 , 50 , 10};
		Random ran = new Random();
		
		int money = ran.nextInt(1000) + 1;
		money *= 10;
		
		System.out.printf("[ %d �� ]\n" , money );
		
		for (int i = 0; i < coin.length; i++) {
			int result = money / coin[i];
			
			if ( result > 0 ) {
				System.out.printf("%d�� %d��\n" , coin[i] , result);
				money %= coin[i];
				
			}// if 
			
		}// for 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}





































