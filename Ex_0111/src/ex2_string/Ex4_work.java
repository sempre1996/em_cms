package ex2_string;

import java.util.Scanner;

public class Ex4_work {
	public static void main(String[] args) {
		
		String[][] actor = { {"[song]", "����", "����", "����"},
				             {"[lee]", "��λ�", "�����ڵ�", "����"},
		                     {"[ryo]", "�û���", "��Ű", "Ÿ¥"} };
		
		// �˻��� ��� : song
		// [song]
		// ����
		// ���� 
		// ����
		// ----------------------- �˻��� �ùٸ��� �� ���
		
		// �˻��� ��� : park 
		// �ش� ���� �����ϴ�!!
		//------------------------ �˻������ ���� ���
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� ��� : ");
		String name = sc.next();
		
		int count = 0;
		
		for (int i = 0; i < actor.length; i++) {
			if ( actor[i][0].equalsIgnoreCase("[" + name + "]")) {
			  for (int j = 0; j < actor[i].length; j++) {
				System.out.println( actor[i][j]);
			}//inner
			}else {
				
				count++;
				if ( count == actor.length) {
				System.out.println("�ش� ���� �����ϴ�!!");
				}//if
				
			}//else
		
	
		
		 }//outer
  
   }// main
	
}	
	
	