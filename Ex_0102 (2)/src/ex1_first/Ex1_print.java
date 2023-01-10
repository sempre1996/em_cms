package ex1_first;

public class Ex1_print {
	
	public static void main(String[] args) {
		// 주석: 컴파일시 JVM이 인지하지 못하는 메모 용도의 텍스트 영역
        // main 메서드: 컴파일 시 가장 먼저 호출되는 영역	
		System.out.println( 100 ); // <-- 한줄이 끝나면 반드시 ;으로 마무리
		System.out.println( 200 );
		
		// 문장을 입력하고자 할떄는 ""안에 출력하고자 하는 데이터를 넣어줘야 한다.
		System.out.println("안녕하세요");
		
		System.out.println(10 + 10);
		System.out.println(10 * 10);
		
		System.out.println("10 * 10 = " + 10 * 10); // "" 뒤에는 +만 가능하다.
		System.out.println("5 - 1 = " + (5 - 1) );
		System.out.println(1 + 1 + "1 + 1 = " + 1 + 1);
		
	}
	
	
}
