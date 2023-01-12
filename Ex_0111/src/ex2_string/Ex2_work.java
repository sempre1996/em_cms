package ex2_string;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		
		// 키보드에서 아무값이나 입력받고 소문자 a의 갯수를 출력
		
		// 입력 : Aoasijfowiejaoisjdlaksjdaoidjalks
		// a의 갯수 :
		
		int count = 0;
		
		System.out.print("입력 : ");
	   Scanner sc = new Scanner(System.in);
	   String str = sc.next();
	   
	   for (int i = 0; i < str.length(); i++) {
		 
		   if (str.charAt(i) == 'a') {
			   count++;
		}//if
		   
	   }// for
	   System.out.println("a의 갯수 : " + count);
	   
	   
	
	
		
		
		
		
		
		
		
		
		
		
	}// main

}
