package ex1_operator;

public class Ex5_work {
	public static void main(String[] args) {
		
	/*
	 ���) 
	 �Ϸ���귮 : 17��
	 �ð��� ��� : 0.7xxxxxx��
	 * 
	 * 
	 �������� �ִ�.
	 ��, ��� , �������� Ű��� �ִµ�, �Ϸ���귮�� ��
	 5 , 7 , 5����.
	 
	 1) ���������� �Ϸ翡 ����Ǵ� ������ �� ������ ���
	 2) �ѽð��� ��� ������ ����Ǵ��� ���
	 
	 ## ��, ������ ������ �Ϸ���귮��  ������ ������ int Ÿ������
	  �ð��� ������� ����� ������ float Ÿ������ ���� ��.
	  
	   
	 ## ���� ����� ������ �ڵ�����, �ּ� �� ���� �̻��� ����� ����� �� ��.  
	 */
	
	int pear = 5;
	int apple = 7;
	int orange = 5;
	int total = (pear + apple + orange);
	System.out.println("total : " + total);
	
	// float avg = total /24f;
	float avg = (float) total / 24;
	System.out.println(avg);
	
	
	}//main
	
	
	

}
