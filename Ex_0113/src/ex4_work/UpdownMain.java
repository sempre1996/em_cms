package ex4_work;

import java.util.Scanner;

public class UpdownMain {
	public static void main(String[] args) {
		
		// 1~ 50 ������ ������ �߻���Ų��.
		// ����Ŭ�������� �������� �Է¹޴´�
		// �Է¹��� ���� up , down, ���������� �Ǵ�
		// ������ ��� mainŬ������ while���� ������������ ó��
		
		// ���� : 30
		// down
		// ���� : 15
		// up
		// ���� : 25
		// 3ȸ���� ����!!
		Updown ud = new Updown();
		Scanner sc = new Scanner(System.in);
		
		
		while (ud.result) {
			System.out.print("���� : ");
			int me = sc.nextInt();
			ud.check(me);
			System.out.println("====================");
		}//while
		
		
		
		
	}// main

}
