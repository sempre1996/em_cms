package ex2_string;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {
		// ȸ���� �Ǵ��ϱ�
		// ȸ������ ������ �о �ڿ��� �о �Ȱ��� ������ ����
		// 121 abba 
		
		// �� : a1221a
		// a1221a �� ȸ���� �Դϴ�.
		
		// �� : abc
		// abc �� ȸ������ �ƴմϴ�.
		
     
     String rev = "";
     
     System.out.print("�� : ");
     Scanner sc = new Scanner(System.in);
     String str = sc.next(); // ���� ��
     
     for (int i = str.length()-1; i >= 0; i--) {
		rev += str.charAt(i); 
	 }// for
		
	 if (str.equals(rev)) {
		System.out.println(str + "��(��) ȸ���� �Դϴ�.");
	}else {
		System.out.println(str + "��(��) ȸ������ �ƴմϴ�.");
	}// else
		
	
		
		
	
	}//main
		
}


