package ex3_work;

public class Ex1_work {
	public static void main(String[] args) {
		
		// �迭 arr�� ����ִ� ��� ������ ���� ���
		// ��� : 67
		
		
		// ����� ������ ���ٷ� ǥ���� �� �ִ�.
		int arr[]= { 10,24,7,16,10};  // ����� ������ �ʱ�ȭ���� �� �ٷ� ����!!
		arr[0] = 10;
		arr[1] = 24;
		arr[2] = 7;
		arr[3] = 16;
		arr[4] = 10;
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		} //for 
		System.out.println("��� : " + sum);
		
		System.out.println("=================================");
		
		char[] cArr = {'J' , 'A' , 'V' , 'A'};
		 //char[] cArr = new char[4];
		 // cArr[0] = 'J';
		 // .....
		
		//for (int i = 0; i < cArr.length; i++) {
		//	System.out.println( cArr[i]);
		//}// for��
		
		// ������ roof(���� for��..)		
		// �迭�� ��� ��� ���뿡 �����ϰ��� �ϴ� �������� ������� for��!!
		for (char c : cArr) {
			System.out.print(" " +c);
		}
		
		
		
		
	}//main

}

































