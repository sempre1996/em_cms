package ex2_overload;

public class BreadMain {
	public static void main(String[] args) {
		
		Bread bread = new Bread();
		
		bread.makeBread();
		System.out.println("=============");
		bread.makeBread(2);
		System.out.println("==================");
		bread.makeBread("팥빵", 3);
		
	// makeBread()	1번 호출시
	// 빵을 만들었습니다.
		
	// makeBread() 2번 호출시
    // 빵을 만들었습니다.
    // 빵을 만들었습니다.
	// 2개의 빵을 만들었어요.
		
	// makeBread() 3번 호출시
	// 크림빵을 만들었습니다.	
	// 크림빵을 만들었습니다.	
	// 크림빵을 만들었습니다.	
	// 2개의 크림빵을 만들었어요
		
	}//main

}
