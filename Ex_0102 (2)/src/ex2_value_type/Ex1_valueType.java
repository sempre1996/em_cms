package ex2_value_type;

public class Ex1_valueType {
	
	public static void main(String[] args) {
		
		// �⺻�ڷ���(valueType)
		/*
		 ���� : boolean - 1bit
		 ������ : char - 2byte
		 ������ : byte - 1byte ........ -128 ~ 127
		        short - 2byte ....... -32768 ~ 32767
		        int - 4byte ........ -21�� ~ 21�� 
		        long - 8byte ......... -900�� ~ 900�� 
		       
		 �Ǽ��� : float - 4.xx byte   
		        double - 8.xx byte
		 */
		
		// ���� : Ư�� ���� �����ϱ� ���� ���� 
		// �׸�(�ڷ���)�� �����ϴ� �ĺ���
		
		// ���� ���� ��Ģ !
		// 1) �ڷ��� ������; (����)  
		// 2) ������ = ��;  (����)
		// 3) �ڷ��� ������ = ��; ( �ʱ�ȭ )
		
		// ���� ����� ���� ����!!
		// 1) ���� �������� �����̸��� �ߺ����� �ʵ��� �Ѵ�.
		// 2) _�� �����ϰ�� Ư�����ڸ� ������ �� ����.
		// 3) �������� �ݵ�� �ҹ��ڷ� ����!!
		// 4) �������� ���ڷ� ������ �� ������, �ݵ�� �������� �ۼ��� ��.
		
		// 1) ����
		//  ���� ����. ��, true�� false������ �����ϴ� �ڷ��� Ÿ��.
		boolean b;  
		b = true;
		b = false;
		
		// �ڷ��� Ÿ�Կ� �´� ���� �־���� �Ѵ�!!
		// boolean b2 = ;
		System.out.println( b );
		
		b = true;
		System.out.println( b );
		
		// ������
		// �C����ǥ �ȿ� �� �ѱ��ڸ� ���� ������ �ڷ���
        char c = 'A';
        System.out.println("c : " + c);
        
       //char c2 = 65 + 1;
        char c2 = 'B' + 1;
        System.out.println("c2 : " + c2);
        // ��������� �R���� �ѱ��ڸ� ����!! 
        
		// ������
        // byte by = 128;
		int n1 = 2100000000;
		
		// int�� ������ ����� ���� long Ÿ�Կ� �����Ϸ��� �ݵ�� LŰ���带 �߰��ؾ� �Ѵ�.
		long n2 = 2200000000L;
		System.out.println("long �� : " + n2);
		
		// �Ǽ���
		// �Ҽ����� ���� ������ �����ϱ� ���� �ڷ��� 
		float f1 = 3.14F; // F�� ������ ��� ���� !!
		double f2 = 3.14;
        System.out.println(f1);
        System.out.println(f2);
		
        
        f1 = 100;
        f2 = 100;
        System.out.println(f1);
        System.out.println(f2);
		
	}// main
	

}
