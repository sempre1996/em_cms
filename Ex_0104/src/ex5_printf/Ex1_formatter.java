package ex5_printf;

public class Ex1_formatter {
	public static void main(String[] args) {
		
		// ������ : ����� �������� ����� ���ϴ� ������ ��� �����ϰ� ���ִ� ����
		
		// ������ 23�� 01�� 05�� �Դϴ�
		int y = 23;
		int m = 1;
		int d = 15;
		
		System.out.println("������  " + y + "�� " + m + "�� " + d +"�� ");
		System.out.printf("������ %d�� %02d�� %02d��\n" , y , m , d);
		
		
		// ������ ������ 13.5�� �Դϴ�.
		System.out.printf("������ ������ %.1f�� �Դϴ�.\n " , 13.5f);
		
		// ���� A�� �Դϴ�
		char bt ='A';
		System.out.printf("���� %c�� �Դϴ�\n" , bt);
		
		// �� �̸��� ȫ�浿 �Դϴ�.
		System.out.printf("�� �̸��� %s�Դϴ�\n" , "ȫ�浿"); 
		
		// ������ 100% ���� �߽��ϴ�
		System.out.printf("%d%%\n" , 100);
		
		// 1) %d : ����
		// 2) %f : �Ǽ�
		// 3) %c : ����
		// 4) %s : ���ڿ�
		// 5) %% : %��ȣ
		
	}//main
	

}






































