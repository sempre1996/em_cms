package ex1_string;

public class Ex2_String_Method {
	public static void main(String[] args) {
		
	// String Ŭ������ �ż���(���)��
	// �޼���� � �۾��� �����ϱ� ���� ��ɹ����� ����	
	// �ݺ������� ���Ǵ� �ڵ带 ���̱� ���� ���� ����	
		
	String name = "Hong Gil Dong";
	int len = name.length(); // �޼���� �ݵ�� () �Ұ�ȣ�� ������. 1���� ���� �����ϰ�!!
	System.out.println("������ ���� : " + len);
	
	int index = name.indexOf('o');	
	System.out.println("�� ù��° o�� ��ġ : " + index);
		
	index = name.lastIndexOf('o');	
	System.out.println("�� ���� o�� ��ġ : " + index);
		
	char c = name.charAt(7);
	System.out.println("������ ���� : " + c);
	
	String s1 = name.substring(5); // �߶󳻴� �޼��� 
	System.out.println("5���� ��ġ������ ��� ������ �߶󳻽ÿ�." + s1);
	
	s1 = name.substring(5 , 10);
	System.out.println("5~9��° ������ ������ �߶󳻽ÿ�." + s1);
	
	name = "Hone Gil Dong";
	 //s1 = name.replace('.', '/');
	//System.out.println(".�� /�� ġȯ : " + s1);
	name = name.replace("on", "ii");
	System.out.println("on�� ii�� ġȯ : " + name);
	
	name = name.replaceAll("ii", "on");
	System.out.println("ii�� on���� ġȯ : " + name);
	
	name = "Kim. Lee. Park";
	String name2 = "Kim. Lee. Park";
	
	name = name.replace('.', '/');
	System.out.println("replace : " + name);
	
	name2 = name2.replaceAll(".", "/");
	System.out.println("replaceAll : " + name2);
	
	String id = "  hi hello  ";
	id = id.trim(); // ���� �յ��� �ǹ̾��� ������ ����!!
	System.out.println("trim����� �� ���� : " + id.length());
	
	// Ư�� ������ �������� �迭 ���·� ������ �������ִ� �޼���
	String[] id2 = id.split(" ");
	System.out.println( id2[0] + " / " + id2[1] );
	
	String answer = "Apple";
	
	if ( answer.equalsIgnoreCase("apple") ) {
		System.out.println("���� ����");
	}//if
	
	// ��ũ�� Ŭ������ �޼���� �ƴ����� , ������ ���� ����ϰԵ� �޼���
	// ���������� ���ڿ�(String)�� ������ ������ ���� ������ �ٲ㺸��!!
	String num = "11";
	int a = Integer.parseInt( num );
	System.out.println( a + 1 );
	
	
	
	
	}//main

}
