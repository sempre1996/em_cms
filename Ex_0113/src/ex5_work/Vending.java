package ex5_work;

public class Vending {
	
	private Can[] can = new Can[3];
	private int money = 0;
	
	public void init() {
		for (int i = 0; i < can.length; i++) {
			  can[i] = new Can();
		}//for
		
		can[0].setCanName("�ݶ�");
		can[0].setPrice(900);
		
		can[1].setCanName("ȯŸ");
		can[1].setPrice(1000);
		
		can[2].setCanName("���̴�");
		can[2].setPrice(800);

	}

	public void showCans( int money ) {
		for (int i = 0; i < can.length; i++) {
			if (can[i].getPrice() <= money) {
				System.out.printf("%s : %d��\n", can[i].getCanName() , can[i].getPrice());
			}
		}
		System.out.println("=======================");
	}
	
	public void outCan( String name ) {
		for (int i= 0; i < can.length; i++) {
			if (name.equals(can[i].getCanName())) {
				if (money >= can[i].getPrice()) {
					
				}else {
					System.out.println("�ܾ� ����");
				}
			}else {
				System.out.println("�ش� ������ �����ϴ�");
				System.out.println("�ܵ� : " + money);
				
				System.out.println(can[i].getCanName()+" ����");
				money -= can[i].getPrice();
				System.out.println("�ܵ� : " + money);
			}
			 } 
		   
			
		  }	
		}//for
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

