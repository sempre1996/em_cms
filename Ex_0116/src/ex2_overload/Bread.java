package ex2_overload;

public class Bread {
	
	public void makeBread() {
		System.out.println("���� ��������ϴ�.");
	}

	public void makeBread( int count ) {
	   for (int i = 0; i < count; i++) {
		System.out.println("���� ��������ϴ�.");
	}//for
	   System.out.printf("%d���� ���� ��������\n", count);
	}
	
	public void makeBread(String name , int count) {
		for (int i = 0; i < count; i++) {
			System.out.printf("%s��(��) ��������ϴ�\n", name);
		}//for
		System.out.printf("%d����%s��(��) ��������\n", count , name);
	}
	
	
}
