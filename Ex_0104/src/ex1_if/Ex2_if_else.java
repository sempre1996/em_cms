package ex1_if;

public class Ex2_if_else {
	public static void main(String[] args) {
	
	   // if-else��
	   // if(���ǽ�){
	   // ���ǽ��� ���� �� ����Ǵ� ����
	   // }else{
	   // ���ǽ��� ������ �� ����Ǵ� ����
	   // }	
		
		
		
		int n = 50;
		String str = "";
		
		if ( n++ >= 50 ) {
			str = "n�� 50�̻��� ��";
		}else {
			str = "n�� 50�̸��� ��";
		}
		
		System.out.println(str);
		
		System.out.println("------------------------------------------");
		
		char ch = '��';
		
		if (ch == '��') {
			str = "����� �����Դϴ�";
		}else {
			str = "����� �����Դϴ�";
		}
		
		System.out.println(str);
		
		System.out.println("------------------------------------------");
		
		
		
		
		// �ٷ� ���� �ڵ带 ���� �����ڷ� �����Ͻÿ�.
		
		ch = '��';
		// ���ǽ� ? ������ : ���ǰ���;
		String res = ch == '��' ? "�����Դϴ�" : "�����Դϴ�";
	    	System.out.println(res);
		
		
		
		
		
		}//main
	

}
















































