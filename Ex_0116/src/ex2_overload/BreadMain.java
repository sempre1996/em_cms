package ex2_overload;

public class BreadMain {
	public static void main(String[] args) {
		
		Bread bread = new Bread();
		
		bread.makeBread();
		System.out.println("=============");
		bread.makeBread(2);
		System.out.println("==================");
		bread.makeBread("�ϻ�", 3);
		
	// makeBread()	1�� ȣ���
	// ���� ��������ϴ�.
		
	// makeBread() 2�� ȣ���
    // ���� ��������ϴ�.
    // ���� ��������ϴ�.
	// 2���� ���� ��������.
		
	// makeBread() 3�� ȣ���
	// ũ������ ��������ϴ�.	
	// ũ������ ��������ϴ�.	
	// ũ������ ��������ϴ�.	
	// 2���� ũ������ ��������
		
	}//main

}
