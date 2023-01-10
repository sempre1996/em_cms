package ex3_casting;

public class Ex2_demotion {
	public static void main(String[] args) {
		
		// 2. 디모션
        // 작은 자료형에 큰 자료형이 대입되는 것. (자동 X)
		
		char c = 'C'; //2byte
		int n = c + 1; // 4byte
		c = (char)n;
		System.out.println(c);
		
		float ff = 5.5f; //4.xx byte
		n = 0; // 4byte
		n = (int)ff;
		System.out.println(n); // 0.5 손실이 발생 꼭 주의하면서 사용할 것!!
		
		
	}

}
