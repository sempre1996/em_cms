package ex2_switch;

public class Ex4_work {
	public static void main(String[] args) {
		// 8���� 31�ϱ��� �ֽ��ϴ�
		// 4���� 30�ϱ��� �ֽ��ϴ�
		// 13���� �����ϴ�
		
		int month = 2;
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month+"���� 31�ϱ��� �ֽ��ϴ�.");
			break;
		case 2:	
            System.out.println("2���� 28�ϱ��� �ֽ��ϴ�. ");
            break;
		
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "���� 30�ϱ��� �ֽ��ϴ�.");
	         break;
		
		default:
			System.out.println(month+"���� �����ϴ�.");
			break;
		}
		
		
	}//main

}































