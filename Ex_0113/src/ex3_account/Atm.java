package ex3_account;



public class Atm {
  
	private int money;
	//�Ա�
	public void deposit( int money ) {
		this.money += money;
		System.out.println("�Ա� �Ϸ�");
		
	}
	// ��� 
	public int withdraw( int money ) {
		if ( this.money - money < 0) {
			System.out.println("��ݺҰ�");
			return 0;
			
		}else {
			this.money -= money;
			System.out.println("��ݼ���");
		}//else
		
		return money;
		
	}
	
	// �ܾ�
	public void showMoney() {
		System.out.println("�ܾ� : " + money);
	}
	
	
	
	
}
