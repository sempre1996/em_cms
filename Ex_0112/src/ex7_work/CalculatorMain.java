package ex7_work;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
		// ��1, ��2 , �����ڸ� Calculator�� getResult()�޼���� �����Ͽ�
    	// ����� ����Ͻÿ�
    	
    	// ��1 : 5
    	// ��2 : 10
    	// ������ : +
    	
    	Scanner sc = new Scanner(System.in);
    	Calculator ca = new Calculator();
    	
    	System.out.print("��1 : ");
    	int num1 = sc.nextInt();
    	
    	System.out.print("�� 2 : ");
    	int num2 = sc.nextInt();
    	
    	System.out.print("������ : ");
    	String op = sc.next();
    	
    	ca.getResult(num1, num2, op);
    	
	}//main
}
