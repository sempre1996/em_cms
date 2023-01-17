package ex3_override;

public class AnimalMain {
	public static void main(String[] args) {
		
		Bear bear = new Bear();
		System.out.println("传: " + bear.getEye());
		System.out.println("促府: " + bear.getLeg());
		System.out.println("漂隆: " + bear.woong);
		
		System.out.println("=====================");
		
		Lion lion = new Lion();
		System.out.println("传 : " + lion.getEye());
		System.out.println("促府 : " + lion.getLeg());
		System.out.println("漂隆 : " + lion.hair);
		
		System.out.println("=====================");
		
		Elephant elephant = new Elephant();
		System.out.println("传 : " + elephant.getEye());
		System.out.println("促府 : " + elephant.getLeg());
		System.out.println("漂隆 : " + elephant.nose);
		
		System.out.println("=======================");
		
		Snake snake = new Snake();
		System.out.println("传 : " + snake.getEye());
		System.out.println("促府 : " + snake.getLeg());
		System.out.println("漂隆 : " + snake.sensor);
	
		
		
		
	}//main

}
