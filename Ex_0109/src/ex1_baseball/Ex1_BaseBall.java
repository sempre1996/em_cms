package ex1_baseball;

import java.util.Random;
import java.util.Scanner;

public class Ex1_BaseBall {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		int com1, com2, com3;
		int u1, u2 , u3;
		
		do {
			// �ߺ����� �ʴ� �� ���� ������ ������!! (do -while��)
			com1 = rnd.nextInt(9) + 1;
			com2 = rnd.nextInt(9) + 1;
			com3 = rnd.nextInt(9) + 1;
			
			
		} while ( com1 == com2 || com1 == com3 || com2 == com3  );
		
		System.out.println("���� : " + com1 + com2 + com3);
		
		int count = 0;
		
		while (true) {
			
			count++;
		
		
		// �����̶�� �����ϴ� �� �ڸ��� ���� �Է¹޴´�
		System.out.print("��1 : ");
		u1 = sc.nextInt();
		
		System.out.print("��2 : ");
		u2 = sc.nextInt();
		
		System.out.print("��3 : ");
		u3 = sc.nextInt();
		
		
	    // ��Ʈ����ũ�� �� ������ ������ ����
		
		int strike = 0;
		int ball = 0;
		
		// ����ó���� ���� ����� ��
		if (u1 == com1) {
             strike++;
        }else if( u1 == com2 || u1 == com3) {
			ball++;
		}// else if
		
		if (u2 == com2) {
            strike++;
        }else if( u2 == com1 || u2 == com3) {
			ball++;
		}// else if
		
		if (u3 == com3) {
            strike++;
        }else if( u3 == com1 || u3 == com2) {
			ball++;
		}// else if
		
		// ����ó��
		if ( strike == 3) {
			System.out.println(count + "ȸ ���� ����!!");
			  break; // ������ ���� ��� while���� Ż��!!
			  
		}else {
			if ( strike == 0 && ball == 0) {
				// out�� �Ǵ��ϴ� if��
				System.out.println("out!!");
			}else {
				// out�� �ƴѰ�� strike�� ball������ �����ش�.
				System.out.printf("%dstrike, %dball\n" , strike ,ball);
			}// else
			
		}// else
		
		
		System.out.println("===============================");
		
		
		
		
	    }// while

    }// main 
}






























