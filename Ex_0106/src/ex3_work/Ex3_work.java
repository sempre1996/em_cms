package ex3_work;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {
		
		// Ű���忡�� �������� �Է¹ް�, �Է¹��� ���ڰ� �Ҽ����� �Ǵ��Ͻÿ�.
		// ��, Ű���忡�� 1�� �޾Ҵٸ� '�Ҽ��� �ƴ�'�� ����ؾ� �Ѵ�
		
		// �� : 5
		// 5�� �Ҽ��Դϴ�
		
		// �� : 6
		// 6�� �Ҽ��� �ƴմϴ�
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("�� : ");
		
		int n = sc.nextInt();
		int i = 0; // �Ϻη� ���������� ���� !! 
		for ( i = 2; i <= n; i++){
			if (n % i == 0) {
				break;
				
			}//if
		}//for
		
		if ( i == n) {
			System.out.println(n + "�� �Ҽ��Դϴ�");
			
		}else {
			System.out.println(n + "�� �Ҽ��� �ƴմϴ�");
		}
		
	
	}// main

}










































