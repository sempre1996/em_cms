package ex2_switch;

public class Ex5_work {
	public static void main(String[] args) {
		
		// 10 + 20 = 30
		
		int su1 = 10;
		int su2 = 20;
		int res = 0;
		char op = '%';
		
		switch (op) {
		case '+':
			res = su1 + su2;
			System.out.println(su1 + "+" + su2+"="+res);
			break;
			
		case '-':
			res = su1 -su2;
			System.out.println(su1+"-"+su2+"="+res);
			break;
			
		case '*':
			res = su1 * su2;
			System.out.println(su1 + "*" + su2+ "=" +res);
			break;
			
		case '/':
			res = su1 / su2;
			System.out.println(su1 + "/"+ su2+"="+ res);
		   break;
		   
		case '%':
			res = su1 % su2;
			System.out.println(su1 + "%"+ su2 + "="+ res);
			break;
		   
		default:
			System.out.println("사칙연산이 아닙니다.");
			break;
		   
		   
		   
		   
		}
	
	
	}//main

}




































