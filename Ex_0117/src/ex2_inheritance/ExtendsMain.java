package ex2_inheritance;

public class ExtendsMain {
	public static void main(String[] args) {
		// 상속관계에서의 자식클래스는 부모가 가진 자원(속성 , 메서드)을
		// 마음대로 가져다가 사용할 수 있다.
		
		
		
		Child c1 = new Child();
		System.out.println( c1.money );
		// 부모자식 관계의 클래스라고 해도 private으로 지정된 변수를
		// 자식은 가져다 쓰지 못한다.
	    // System.out.println( c1.str );
		
		System.out.println( c1.car );
		
		Parent p1 = new Parent();
		// p1.
		// 부모는 자식클래스를 꺼내지 못한다!!
		
		
		if ( c1 instanceof Parent) {
			System.out.println("c1은 Parent와 인스턴스가 같습니다.");
		}//if
		
	    
	}//main

}
