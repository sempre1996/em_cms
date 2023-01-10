package ex1_operator;

public class Ex5_work {
	public static void main(String[] args) {
		
	/*
	 결과) 
	 하루생산량 : 17개
	 시간당 평균 : 0.7xxxxxx개
	 * 
	 * 
	 과수원이 있다.
	 배, 사과 , 오렌지를 키우고 있는데, 하루생산량은 각
	 5 , 7 , 5개다.
	 
	 1) 과수원에서 하루에 생산되는 과일의 총 갯수를 출력
	 2) 한시간에 몇개의 과일이 생산되는지 출력
	 
	 ## 단, 과일의 갯수와 하루생산량을  저장할 변수는 int 타입으로
	  시간당 생산수를 출력할 변수는 float 타입으로 만들 것.
	  
	   
	 ## 같은 결과가 나오는 코드지만, 최소 두 가지 이상의 방법을 사용해 볼 것.  
	 */
	
	int pear = 5;
	int apple = 7;
	int orange = 5;
	int total = (pear + apple + orange);
	System.out.println("total : " + total);
	
	// float avg = total /24f;
	float avg = (float) total / 24;
	System.out.println(avg);
	
	
	}//main
	
	
	

}
