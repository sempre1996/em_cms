package ex6_generic;

public class GenMain {
	public static void main(String[] args) {
		
		// ���ʸ� Ÿ���� String���� ������ gen1��ü 
		GenEx<String> gen1 = new GenEx<String>();
		gen1.setValue("hi");
		String res = gen1.getValue();
		System.out.println(res);
		
		// ���ʸ�Ÿ���� Ŭ�������� �־��� �� �ֱ� ������
		// �⺻�ڷ����� ����ϰ� �ʹٸ� wrapper�� �־���� �Ѵ�
		GenEx<Integer> gen2 = new GenEx<Integer>();
		gen2.setValue(100);
		int num = gen2.getValue();
		System.out.println(num);
		
		// �⺻�ڷ����� wrapper Ŭ����
		// Integer --> int
		// Character --> char
		// Byte --> byte
		// Short --> short
		// Boolean --> boolean
		// Long -- > long
		// Float --> float
		// Double --> double
		
		}//main

}