package ex7_while;

import java.util.Random;

public class Ex2_do_while {
	public static void main(String[] args) {
		
	 // do-while�� : �� ó�� , �� ��
	 //	����� �� �����ϰ� ;���� ���ξ�� �Ѵ�.
	 // do {
	 //	���ǽ��� ���� �� ����Ǵ� ����
	 // }while( ���ǽ� );
		
	 int i = 11;
	 do {
		 System.out.println(i);
		 //i++;
	} while ( i <= 10 );
	 
	 System.out.println("--------------");
	 
	 // ���� java , jsp , android�� ��������
	 // 0~130 ������ ���� ��´�	
	 // do ~ while�� ���� �� ������ ������ ��� 0~100 �����϶���
	 // while�� �������� �� ���� ���� ������ ���.
	 
	 // ���
	 // �ڹ� : 92	
	 // jsp : 25	
	 // �ȵ� : 100
	 
	 int java = 0;
	 int jsp = 0;
	 int and = 0;
	 
	 Random ran = new Random();
	 
	 do {
		 java =ran.nextInt(131);
		 jsp = ran.nextInt(131);
		 and = ran.nextInt(131);
		
	} while (java > 100 || jsp > 100 || and > 100);
	 
	System.out.println( "�ڹ� : " + java);
	System.out.println( "jsp : " + jsp); 
	System.out.println( "�ȵ� : " + and);
	
	}//main
	

}




































