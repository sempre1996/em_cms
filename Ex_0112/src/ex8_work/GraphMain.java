package ex8_work;

import java.util.Random;

public class GraphMain {
	
	public static void main(String[] args) {
	
		// 0 ~ 9 사이의 난수를 100개 만들어서 저장
		
	    // 12312312308120948102948012948102948120948.....
		// 0의 갯수 : ##### 6
		// 1의 갯수 : ######## 9
		// .....
		// 9의 갯수 : #### 4
		
	Random rnd = new Random();
	String number = "";
	
	for (int i = 0; i < 100; i++) {
		number += rnd.nextInt(10);
	}
	System.out.println(number);
	
	int[] arr = new int[10];
	
	for (int i = 0; i < number.length(); i++) {
		String s = "" + number.charAt(i);
		arr[Integer.parseInt(s)]++;
	}
		Graph gc = new Graph();
		gc.print(arr);
		
	}// main
	
	

}
