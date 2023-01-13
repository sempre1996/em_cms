package ex3_account;



public class Atm {
  
	private int money;
	//입금
	public void deposit( int money ) {
		this.money += money;
		System.out.println("입금 완료");
		
	}
	// 출금 
	public int withdraw( int money ) {
		if ( this.money - money < 0) {
			System.out.println("출금불가");
			return 0;
			
		}else {
			this.money -= money;
			System.out.println("출금성공");
		}//else
		
		return money;
		
	}
	
	// 잔액
	public void showMoney() {
		System.out.println("잔액 : " + money);
	}
	
	
	
	
}
