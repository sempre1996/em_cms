package ex1_Overload;

public class Ex1_Overload {
    // �޼��� �����ε�
	// �����ε��� �޼����� ' �ߺ� ����' ��� �ϸ� �ϳ��� Ŭ���� ���ο���
	// ���� �̸��� ���� �޼��尡 ������ ���ǵǴ� ���� ���Ѵ�
	
	// ** �����ε带 ���� ��Ģ**
	// 1) �޼����� ������ ������ �޶�� �Ѵ�.
	// 2) ������ ������ ���ٸ� Ÿ���� �޶�� �Ѵ�.
	// 3) ������ ���� Ÿ���� ���� ��, ���� ������ �޶�� �Ѵ�.
	public void result() {
		System.out.println("���ڰ� ���� �޼���");
		
		
	}//result

	public void result( int n ) {
		System.out.println("������ ���ڷ� �޴� �޼���");
	}//result
	
	public void result( char c ) {
		System.out.println("���ڸ� ���ڷ� �޴� �޼���");
	}
	
	public void result( String s ) {
		System.out.println("������ ���ڷ� �޴� �޼���");
	}
	
	public void result( String s , int n ) {
		System.out.println("����, ���� ������ ���ڸ� �޴� �޼���");
	}
	
	public void result( int n , String s ) {
		System.out.println("����, ���� ������ ���ڸ� �޴� �޼���");
	}
	
}
