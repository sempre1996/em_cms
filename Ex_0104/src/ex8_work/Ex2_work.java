package ex8_work;

public class Ex2_work {
	public static void main(String[] args) {
		
		// 2�� for���� ����Ͽ� �Ʒ��� ����� �����Ͻÿ�.
		
		// 1 2 3 4 5 6 7 8 9 10
		// 2 3 4 5 6 7 8 9 10 1
		// 3 4 5 6 7 8 9 10 1 2
		//   ..............
		//10 1 2 3 4 5 6 7 8 9 
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j < 10; j++) {
				int num = i + j;
				if (num > 10) {
					num -= 10;
				}
				
				System.out.printf("%02d " ,num);
				
			}//inner
			System.out.println(" ");
		}//outer
		
		
		
	}// main

}













































