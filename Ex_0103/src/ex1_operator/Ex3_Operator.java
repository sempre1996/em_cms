package ex1_operator;

public class Ex3_Operator {
	public static void main(String[] args) {
	
		
		// 증감 연산자
		// 1씩 증가시키거나 1씩 감소시키는 연산자
		// 선행증감과 후행증감의 차이점만 확실하게 구별!!
		
		int a = 10;
		System.out.println("a : " + ++a); // 선행증가, 선행감소  ( 가장 빨리 먼저 실행댐 !!!), 다이렉트
		
		int b = 10;
		System.out.println("b : " + b++); // 후행증가, 후행감소 ( 제일 마지막에 실행 !!)
		System.out.println(b); // 지금 당장은 아니지만 다음에 똑같은 변수를 사용하면 그때부터 증가!!!!
		
		b++;
		--b;
		--b;
		++b;                
		b--;
		b--;
		b++;
		++b;
		System.out.println(b--);
		System.out.println(b);
		
		// 증감연산자는 한번에 1씩만 제어가 가능하므로 
		// 2이상의 증감을 하려면 대입연산자를 사용하는 것이 좋다!!!
		
		b += 2;
		
		// 삼항(조건) 연산자
		// 조건을 두고, 그 조건에 대한 결과가 참일 때와 거짓일 때에 따라 
		// 다른 대답을 돌려주는 연산자
		
		int aa = 10;
		int bb = 15;
		boolean res = ++aa >= b ? true : false; // 삼항연산자는 ? , : 세트!!
	    System.out.println(res);	
		
	    char res2 = ++aa < bb ? 'y' : 'n';
	    System.out.println(res2);
	    
	    
		
		
		
		
		
		
		
		
		
		
	}// main
	
}// class and
