package ex1_operator;

public class Ex3_Operator {
	public static void main(String[] args) {
	
		
		// ���� ������
		// 1�� ������Ű�ų� 1�� ���ҽ�Ű�� ������
		// ���������� ���������� �������� Ȯ���ϰ� ����!!
		
		int a = 10;
		System.out.println("a : " + ++a); // ��������, ���న��  ( ���� ���� ���� ����� !!!), ���̷�Ʈ
		
		int b = 10;
		System.out.println("b : " + b++); // ��������, ���న�� ( ���� �������� ���� !!)
		System.out.println(b); // ���� ������ �ƴ����� ������ �Ȱ��� ������ ����ϸ� �׶����� ����!!!!
		
		b++;
		--b;
		--b;
		++b;                
		b--;
		b--;
		b++;
		++b;
		System.out.println(b--);
		System.out.println(b);
		
		// ���������ڴ� �ѹ��� 1���� ��� �����ϹǷ� 
		// 2�̻��� ������ �Ϸ��� ���Կ����ڸ� ����ϴ� ���� ����!!!
		
		b += 2;
		
		// ����(����) ������
		// ������ �ΰ�, �� ���ǿ� ���� ����� ���� ���� ������ ���� ���� 
		// �ٸ� ����� �����ִ� ������
		
		int aa = 10;
		int bb = 15;
		boolean res = ++aa >= b ? true : false; // ���׿����ڴ� ? , : ��Ʈ!!
	    System.out.println(res);	
		
	    char res2 = ++aa < bb ? 'y' : 'n';
	    System.out.println(res2);
	    
	    
		
		
		
		
		
		
		
		
		
		
	}// main
	
}// class and
