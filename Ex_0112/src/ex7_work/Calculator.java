package ex7_work;

public class Calculator{
	  //                        (int...n)
	public void getResult( int num1 , int num2 , String op ) {
		
		switch (op) {
		case "+":
			System.out.println(num1 + num2); 
			break;
		case "-":
            System.out.println(num1 - num2);
            break;
		case "*":
		    System.out.println(num1 * num2);
		    break;
		case "/":
			System.out.println(num1 / num2);
			break;
		case "%":
			System.out.println(num1 % num2);
			break;
		default:
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			break;
		}
		
		
	// result = String.format("%d + %d = %d", n[0],n[1],n[0] + n[1]);	
	// ���� ������ε� ����!!
		
	}
	
	
}
  
	
	

