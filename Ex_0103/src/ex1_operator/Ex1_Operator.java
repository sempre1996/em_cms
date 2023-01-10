package ex1_operator;

public class Ex1_Operator {
	public static void main(String[] args) {
		
		/*
		 * 연산자(operator)
		 1. 최고연산자 : . , () 우선순위가 가장 빠름.
		 2. 증감연산자 : ++ , --
		 3. 산술연산자 : + , - , * , / , %
		 4. 시프트연산자 : >> , << ,                                 * 논리, 대입 ,증감 연산자 우선순위 공부 !!
		 5. 비교연산자 : > , < , >= , <= , == , !=
		 6. 비트연산자 : & , | , ^
		 7. 논리연산자 : && , || , !
		 8. 삼항(조건)연산자 : ? , :
		 9. 대입연산자 : = , *= , /= , %= , += , -=         
		 */
		
		// 1. 산술연산자
		// 4칙연산과 나머지 연산자 가지고 있다.
		
		int n1 = 20;
		int n2 = 7;
		int n3 = n1 * n2;
		System.out.println("n3 : " + n3);
		
		n3 = n1 / n2; // 몫 값 !!
		System.out.println(" / : " + n3);
		
		n3 = n1 % n2; // 나머지 값 !!
		System.out.println(" % : " + n3);
		
		System.out.println("-----------------");
		
		// 대입 연산자
		// 특정 값을 변수에 전달하여 기억시킬 때 사용하는 연산자
		
		int i1 = 10;
		int i2 = 3;
		i1 += 3; // i1 = i1 + i2 ( 이 식을 머릿속에서 떠올라야 함 !!)
		System.out.println("+= : " + i1);
		
		i1 -= 1; // i1 = i1 - 1;
		System.out.println("-= : " + i1);
		
		i1 %= 5; // i1= i1 % 5;
		System.out.println("%= : " + i1);
		
		i1 *= 6; // i1= i1 * 6;
		System.out.println("*= : " + i1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
