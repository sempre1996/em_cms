package ex8_work;

public class Ex1_work {
	public static void main(String[] args) {
		
		// 2중 for문을 사용하여 아래의 결과를 출력하시오.
		
		//*
		//* *
		//* * *
		//* * * *
		//* * * * *
		
		System.out.println("--------------------------------------");
		
		//        * 
		//      * * *
	 	//    * * * * *
		//  * * * * * * *
		//* * * * * * * * *
		
	   
	   for (int i = 1; i < 6; i++) {
		   for (int j = 0; j < i; j++) {
			   System.out.print(" * ");
			
		}
		System.out.println(" ");
	}
	   
	   System.out.println("----------------------------------");
	   
	   for (int i = 0; i < 5; i++) {
		   for (int j = i; j <= 3 ; j++) {
			   
			System.out.print("  ");
			}
			 for (int j1 = 0; j1 < 2*i+1; j1++) {
				   System.out.print(" *");
				
			}
			 System.out.println();
		}
		
	}
		
	}// main














































