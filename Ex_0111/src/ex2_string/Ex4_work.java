package ex2_string;

import java.util.Scanner;

public class Ex4_work {
	public static void main(String[] args) {
		
		String[][] actor = { {"[song]", "박쥐", "괴물", "관상"},
				             {"[lee]", "백두산", "내부자들", "광해"},
		                     {"[ryo]", "올빼미", "럭키", "타짜"} };
		
		// 검색할 배우 : song
		// [song]
		// 박쥐
		// 괴물 
		// 관상
		// ----------------------- 검색이 올바르게 된 경우
		
		// 검색할 배우 : park 
		// 해당 배우는 없습니다!!
		//------------------------ 검색결과가 없는 경우
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 배우 : ");
		String name = sc.next();
		
		int count = 0;
		
		for (int i = 0; i < actor.length; i++) {
			if ( actor[i][0].equalsIgnoreCase("[" + name + "]")) {
			  for (int j = 0; j < actor[i].length; j++) {
				System.out.println( actor[i][j]);
			}//inner
			}else {
				
				count++;
				if ( count == actor.length) {
				System.out.println("해당 배우는 없습니다!!");
				}//if
				
			}//else
		
	
		
		 }//outer
  
   }// main
	
}	
	
	