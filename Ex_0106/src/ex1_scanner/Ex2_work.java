package ex1_scanner;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		
		// Ű���忡�� n1�� n2������ ���� �������� �Է� �޴´�
		// n1���� n2������ ���� ���.
		
		// ��1 : 2
		// ��2 : 5
		// ��� : 14
		
		// ��1 : 5
		// ��2 : 1
		// ��� : 15
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��1 : ");
		int n1 = sc.nextInt();
		
		System.out.print("��2 : " + n1);
		int n2 = sc.nextInt();
		int result = 0;
		
		// �������� �� ��ȯ
		if ( n1 > n2 ) {
			int n3 = n1;
			n1 = n2;
			n2 = n3;
		}// if
		
		for (int i = n1; i <= n2; i++) {
			result += i;
		}//for
		
		System.out.println("��� : " + result);
		
		//System.out.print("���� : ");
		//String str = sc.next();
		//System.out.println("��� : " + str);
		
		
		
		
		
		
		
	}//main

}








































