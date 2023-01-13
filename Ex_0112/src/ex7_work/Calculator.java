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
			System.out.println("잘못입력하셨습니다.");
			break;
		}
		
		
	// result = String.format("%d + %d = %d", n[0],n[1],n[0] + n[1]);	
	// 위에 방법으로도 가능!!
		
	}
	
	
}
  
	
	

