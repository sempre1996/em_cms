package ex3_work;

import java.util.Random;
import java.util.Scanner;

public class Ex1_baseball {
	public static void main(String[] args) {
		
		// ������ ������ ���ھ߱� ������
		// �迭�� ����Ͽ� �ڵ带 �ٿ�������.
		
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		int[] user = new int[3];
		int[] com = new int[3];
		
		do {
			
			for (int i = 0; i < com.length; i++) {
				com[i] = rnd.nextInt(9) + 1;
			}// for
			
			
		} while ( com[0] == com[1] || com[0] == com[2] || com[1] == com[2] );
		
		//���� ������ ��  ������ ���� ���ѹݺ��ϴ� while���� �ۼ�
		
	    while (true) {
	    	System.out.print("�Է�(��:123) - ");
			int num = sc.nextInt();
	    	// ����ڰ� �Է��� �� �ڸ��� ���� ��, ��, ���� �ڸ��� ��� user�迭�� ����
			
			user[0] = num / 100; // �����ڸ�
			user[1] = num % 100 / 10; // �����ڸ�
	    	user[2] = num % 100 % 10; // �����ڸ�

           int strike = 0;
           int ball = 0;
           
           // ����� ��
	    	
           for (int i = 0; i < com.length; i++) {
			  for (int j = 0; j < com.length; j++) {
				
				  if ( i == j) {
					if ( com[i] == user[j] ) {
						   strike++;
					}else {
					if ( com[i] == user[j] ) {
							ball++; 
						}// if
					}// else
				} // if
			}// inner
        	   
		}// outer
           
           if ( strike == 3 ) {
			  System.out.println("����!!");
			  break;
		}else {
			// ��Ʈ����ũ�� ���� �� ���� �ִ� ���
			if ( strike > 0 || ball > 0 ) {
				System.out.printf("%d strike, %d ball\n" , strike , ball);
			}else {
				System.out.println("OUT!!");
			}// else
			
		}// else
           System.out.println("=======================");
           
           
           
           
	    }// while
		
	}//main

}


































