package ex1_string;

import java.util.Scanner;

public class Ex1_String {
	public static void main(String[] args) {
		
		// String�� �� ���� Ư¡�� ������ �ִ�.
		// 1) ��ü���� ����� �� ����!! (�Ͻ���, �����)
		// 2) �� �� ������ ���ڿ��� ������ ������ �ʴ´� (�Һ��� Ư¡)
		
	//  Ŭ����    ��ü
		String s1 = "abc"; // �Ͻ��� ��ü���� (new x)
		String s2 = "abc"; 
		
		String s3 = new String("abc"); // ����� ��ü����(new o)             
		String s4 = new String("abc"); // ����� ��ü����(new o)             
		
		// ==�� �⺻�ڷ��� ���� ���ϴ� ��� ���� ��
		// ��ü���� ==�� �ּҰ��� ��
		if ( s1 == s3 ) {
			System.out.println("�ּҰ� �����ϴ�.");
		}else {
			System.out.println("�ּҰ� �ٸ��ϴ�.");
		}//else
		
		// String Ŭ������ ��ü�� �ּ� �� ����, ���� ���ϴ� ��찡 �ξ� ����.
		if ( s1.equals( s3 ) ) {
			System.out.println("���� �����ϴ�.");
		}
		
		System.out.println("===============================");
		
		//Scanner sc = new Scanner(System.in);
		//s3 = sc.next();
		
		//if ( s1.equals( s3 ) ) {
			//System.out.println("�����ϴ�.");
		//}//if
		
		String greet = "�ȳ�";
		greet += "�ϼ���";
		System.out.println(greet);
		
		s1 = "bbb";
		s2 = "bbb";
		s2 = "ccc";
		
		
    }// main

}

































