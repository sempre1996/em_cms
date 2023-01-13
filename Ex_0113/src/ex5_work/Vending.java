package ex5_work;

public class Vending {
	
	private Can[] can = new Can[3];
	private int money = 0;
	
	public void init() {
		for (int i = 0; i < can.length; i++) {
			  can[i] = new Can();
		}//for
		
		can[0].setCanName("콜라");
		can[0].setPrice(900);
		
		can[1].setCanName("환타");
		can[1].setPrice(1000);
		
		can[2].setCanName("사이다");
		can[2].setPrice(800);

	}

	public void showCans( int money ) {
		for (int i = 0; i < can.length; i++) {
			if (can[i].getPrice() <= money) {
				System.out.printf("%s : %d원\n", can[i].getCanName() , can[i].getPrice());
			}
		}
		System.out.println("=======================");
	}
	
	public void outCan( String name ) {
		for (int i= 0; i < can.length; i++) {
			if (name.equals(can[i].getCanName())) {
				if (money >= can[i].getPrice()) {
					
				}else {
					System.out.println("잔액 부족");
				}
			}else {
				System.out.println("해당 물건이 없습니다");
				System.out.println("잔돈 : " + money);
				
				System.out.println(can[i].getCanName()+" 선택");
				money -= can[i].getPrice();
				System.out.println("잔돈 : " + money);
			}
			 } 
		   
			
		  }	
		}//for
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

