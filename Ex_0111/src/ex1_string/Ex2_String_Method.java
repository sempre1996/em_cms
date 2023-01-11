package ex1_string;

public class Ex2_String_Method {
	public static void main(String[] args) {
		
	// String 클래스의 매서드(기능)들
	// 메서드란 어떤 작업을 수행하기 위한 명령문들의 집합	
	// 반복적으로 사용되는 코드를 줄이기 위해 쓰는 개념	
		
	String name = "Hong Gil Dong";
	int len = name.length(); // 메서드는 반드시 () 소괄호를 가진다. 1부터 시작 유일하게!!
	System.out.println("문장의 길이 : " + len);
	
	int index = name.indexOf('o');	
	System.out.println("맨 첫번째 o의 위치 : " + index);
		
	index = name.lastIndexOf('o');	
	System.out.println("맨 뒤의 o의 위치 : " + index);
		
	char c = name.charAt(7);
	System.out.println("추출한 문자 : " + c);
	
	String s1 = name.substring(5); // 잘라내는 메서드 
	System.out.println("5번쨰 위치부터의 모든 문장을 잘라내시오." + s1);
	
	s1 = name.substring(5 , 10);
	System.out.println("5~9번째 까지의 문장을 잘라내시오." + s1);
	
	name = "Hone Gil Dong";
	 //s1 = name.replace('.', '/');
	//System.out.println(".을 /로 치환 : " + s1);
	name = name.replace("on", "ii");
	System.out.println("on을 ii로 치환 : " + name);
	
	name = name.replaceAll("ii", "on");
	System.out.println("ii를 on으로 치환 : " + name);
	
	name = "Kim. Lee. Park";
	String name2 = "Kim. Lee. Park";
	
	name = name.replace('.', '/');
	System.out.println("replace : " + name);
	
	name2 = name2.replaceAll(".", "/");
	System.out.println("replaceAll : " + name2);
	
	String id = "  hi hello  ";
	id = id.trim(); // 문장 앞뒤의 의미없는 공백을 제거!!
	System.out.println("trim사용한 후 길이 : " + id.length());
	
	// 특정 문장을 기준으로 배열 형태로 나눠서 저장해주는 메서드
	String[] id2 = id.split(" ");
	System.out.println( id2[0] + " / " + id2[1] );
	
	String answer = "Apple";
	
	if ( answer.equalsIgnoreCase("apple") ) {
		System.out.println("값이 같다");
	}//if
	
	// 스크링 클래스의 메서드는 아니지만 , 앞으로 많이 사용하게될 메서드
	// 정수형태의 문자열(String)을 연산이 가능한 실제 정수로 바꿔보자!!
	String num = "11";
	int a = Integer.parseInt( num );
	System.out.println( a + 1 );
	
	
	
	
	}//main

}
