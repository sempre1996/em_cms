package ex2_class_array;

public class PersonMain {
	public static void main(String[] args) {
		
		String[] sArr = new String[3];
		sArr[0] = "aaa";
		sArr[1] = "bbb";
		sArr[2] = "ccc";
	
		
	// String Ŭ������ ���� ��� Ŭ�������� 
	// �迭ȭ ó���Ǿ����� �� �ε������� �޸��Ҵ��� ����� �Ѵ�.	
	Person[] person = new Person[3];
	for (int i = 0; i < person.length; i++) {
		person[i] = new Person();
		
	 }//for
	
	person[0].setName("�踻��");
	person[0].setAge(20);
	
	person[1].setName("�ڼҶ�");
	person[1].setAge(30);
	
	person[2].setName("�����");
	person[2].setAge(40);
	
	// �踻��/20
	// �ڼҶ�/30
	// �����/40
	for (int i = 0; i < person.length; i++) {
		System.out.println( person[i].getName() + " / " + person[i].getAge());
	 }//for
	
	}//main

}
