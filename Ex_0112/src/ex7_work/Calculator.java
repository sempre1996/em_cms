package ex7_work;

public class Calculator{
	
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
			System.out.println("잘못입력하셨습니다.");
			break;
		}
		
		
	}
	
	
}
  
	
	

