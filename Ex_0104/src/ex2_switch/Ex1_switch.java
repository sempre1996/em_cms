package ex2_switch;

public class Ex1_switch {
	public static void main(String[] args) {
		
		// switch-case�� : �񱳰��� ���ǰ��� ���� ����� ó���ϴ� ���
		// switch( �񱳰� ){
		// case ���ǰ� :
		//   �񱳰��� ���ǰ��� ��ġ�ϴ� ��� ����Ǵ� ����
		// break;
		//}
		
		int n = 1;
				
		switch ( n ) { // �񱳰�
		case 1: //���ǰ�( ���ǰ��� Ÿ���� �񱳰��� �ݵ�� ��ġ�ؾ� �Ѵ�.)
			System.out.println("1.���ӽ���");
			break;

		case 2:
			System.out.println("2.���ӼҰ�");
			break; // switch ���� ������ ���������� Ű���� 
			
		case 3:
			System.out.println("3.�ɼ�");
			break;
		
		default :
			// �񱳰��� ���ǰ��� ��� ��ġ���� ���� ���
			// �ݵ�� ����Ǵ� ����
		 System.out.println("1,2,3�߿����� �Է��ϼ���");
		  break;
		}//switch
		
		
	}//main

}

















































