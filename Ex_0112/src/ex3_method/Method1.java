package ex3_method;

public class Method1 {

	// �޼����� ���� �� ����
	
	public void test1() {
		System.out.println("�ȳ��ϼ���");
	}
	
	public int test2( int n ) {
		// ��ȯ���� void�� �ƴ� ���, �������� �ݵ��
		// return ���� ���յǾ� �־�� �Ѵ�.
		
		n += 100;
		System.out.println("n : " + n);
		
		// return ���� �ݵ�� ��ȯ�� Ÿ�԰� �����ش�.
		return n;
	}
	
	public String test3( String s, int n ) {
		String str = "���� " + s + "�̰�, " + n  +"�� �Դϴ�";
		return str;
	}
	
	
}
