package ex8_work;

import java.util.Random;

public class GraphMain {
	
	public static void main(String[] args) {
	
		// 0 ~ 9 ������ ������ 100�� ���� ����
		
	    // 12312312308120948102948012948102948120948.....
		// 0�� ���� : ##### 6
		// 1�� ���� : ######## 9
		// .....
		// 9�� ���� : #### 4
		
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
