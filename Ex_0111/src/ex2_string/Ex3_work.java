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
		
     String str = "";
     String str2 = "";
     
     System.out.print("�� : ");
     Scanner sc = new Scanner(System.in);
     str = sc.next();
     
     for (int i = str.length(); i > 0; i--) {
		str2 += str.charAt(i - 1); 
	 }// for
		
	 if (str.equals(str2)) {
		System.out.println(str + "��(��) ȸ���� �Դϴ�.");
	}else {
		System.out.println(str + "��(��) ȸ������ �ƴմϴ�.");
	}// else
		
	
		
		
	
	}//main
		
}


