package ex1_operator;

public class Ex4_work {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 12;
		
		int res= ++a >= b || 2 + 7 <= b && 13 - b >= 0 && (a += b) - (a % b) > 10 ? 1 : 0;
		System.out.println(res);
		
		//false
		//true
		//true
		//1
		
		
	}//main

}
