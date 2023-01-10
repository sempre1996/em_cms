package ex1_operator;

public class Ex2_Operator {
	public static void main(String[] args) {
		
		// 비교연산자
		// 값을 비교해서 참과 거짓을 판단하는 연산자

		int n1 = 10;
		int n2 = 20;
	    boolean res = n1 < n2;
	    System.out.println("n1 < n2 : " + res);
	    
	    res = n1 >= n2;
	    System.out.println("n1 >= n2 : " + res);
	    
	    res = n1 == n2; // 2개가 같냐고 물어보는 연산자 
		System.out.println("n1 == n2 : " + res);
		                                               // * 2가지의 의미 , 차이점을 파악 !! , < : 작다 , > : 크다
	    res = n1 != n2; // !은 부정을 표현                                                                                          
	    System.out.println("n1 != n2 : " + res);
	    
	    // 논리연산자 (제일 중요)
        // 비교연산자를 통한 연산이 두 개 이상 필요할 때 사용		
		
	    int age = 30;
	    int limit = 35;
	    
	    // and(&&) 연산자 : 앞의 연산이 거짓이면 뒤쪽 연산을 수행하지 않는다.
	    // t && t = t  , f && t = f
	    // t && f = f  , f && f = f
	   
	     res = (limit - age) < 5 && (age += 2) >= 30; // and는 둘다 참인 경우!!
	     System.out.println("&& : " + res);
	     System.out.println(age);
	     
	    int i1 = 10;
	    int i2 = 20;
	    
	    // or(||)연산자 : 앞의 연산이 참일 경우 뒤쪽 연산을 수행하지 않는다.
	    //t || t = t , t || f = t 
        //f || t = t , f || f = f	    
	    
	    res = (i1 += 10) > 20 || i2 - 10 == 11;
	    System.out.println("||연산 : " + res);
	    
	    // not 연산자 : 참을 거짓으로 거짓을 참으로 바꿔주는 연산자
	    System.out.println("!연산자 : " + res);
	    System.out.println("!연산자 : " + !res); // not 연산자는 boolean 변수에만 사용이 댄다. 참을 거짓으로 거짓을 참으로 !!
	    System.out.println(res); // not연산자는 영구적이지 않고 사용할때만 변한다. 그래서 출력하면 false로 나옴!!
	    
	    
		
		
		
	}//main

}



































