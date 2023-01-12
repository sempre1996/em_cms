package ex7_work;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
		// 수1, 수2 , 연산자를 Calculator의 getResult()메서드로 전달하여
    	// 결과를 출력하시오
    	
    	// 수1 : 5
    	// 수2 : 10
    	// 연산자 : +
    	
    	Scanner sc = new Scanner(System.in);
    	Calculator ca = new Calculator();
    	
    	System.out.print("수1 : ");
    	int num1 = sc.nextInt();
    	
    	System.out.print("수 2 : ");
    	int num2 = sc.nextInt();
    	
    	System.out.print("연산자 : ");
    	String op = sc.next();
    	
    	ca.getResult(num1, num2, op);
    	
	}//main
}
