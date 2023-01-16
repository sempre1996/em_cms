package ex2_overload;

public class Bread {
	
	public void makeBread() {
		System.out.println("빵을 만들었습니다.");
	}

	public void makeBread( int count ) {
	   for (int i = 0; i < count; i++) {
		System.out.println("빵을 만들었습니다.");
	}//for
	   System.out.printf("%d개의 빵을 만들었어요\n", count);
	}
	
	public void makeBread(String name , int count) {
		for (int i = 0; i < count; i++) {
			System.out.printf("%s을(를) 만들었씁니다\n", name);
		}//for
		System.out.printf("%d개의%s을(를) 만들었어요\n", count , name);
	}
	
	
}
