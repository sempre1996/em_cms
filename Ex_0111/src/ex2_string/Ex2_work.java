package ex2_string;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		
		// Ű���忡�� �ƹ����̳� �Է¹ް� �ҹ��� a�� ������ ���
		
		// �Է� : Aoasijfowiejaoisjdlaksjdaoidjalks
		// a�� ���� :
		
		int count = 0;
		
		System.out.print("�Է� : ");
	   Scanner sc = new Scanner(System.in);
	   String str = sc.next();
	   
	   for (int i = 0; i < str.length(); i++) {
		 
		   if (str.charAt(i) == 'a') {
			   count++;
		}//if
		   
	   }// for
	   System.out.println("a�� ���� : " + count);
	   
	   
	
	
		
		
		
		
		
		
		
		
		
		
	}// main

}
