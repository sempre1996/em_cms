package ex3_override;

public class Snake extends Animal {

	String sensor = "�㿡�� �� ��";
	
	// �޼����� �������̵�
	// '�޼����� ������'�� �ǹ̸� ������ ��Ӱ����� ��ü����
	// �θ��� �޼��带 ������ �ڽ��� ������ �°� ���븸 ������ �� �� �ֵ��� �ϴ� ���
    @Override
    public int getLeg() {
    	return 0;
    }
    
  
	
	
}
