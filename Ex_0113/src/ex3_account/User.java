package ex3_account;

import java.util.Scanner;

public class User {
     public static void main(String[] args) {
		
   Atm atm = new Atm();
   int money = 0;
    	 
    
   Scanner sc = new Scanner(System.in); 
   
   out : while (true) {
	
	 System.out.println("1.��   �� : "); 
	 System.out.println("�Աݾ� : ");
	 System.out.println("2.��   �� : ");  
	 System.out.println("3.�ܾ�Ȯ�� : ");  
	 System.out.println(" etc.�� �� : ");  
	 System.out.print(">> ");  
	 int select = sc.nextInt(); 
	 
	 switch ( select ) {
	case 1: // �Ա�
		System.out.print("---�Ա�---");
		money = sc.nextInt();
		atm.deposit(money);
		break;
		
    case 2: // ���
    	System.out.println("---���---");
    	System.out.print("��ݾ� : ");
    	money = sc.nextInt();
    	money = atm.withdraw(money);
    	break;
    	
    case 3: // �ܾ�Ȯ��
    	System.out.println("---�ܾ�---");
    	atm.showMoney();
    	break;
    	
	default:
		System.out.println("atm�� �����մϴ�");
		break out;
		
	 }// switch
	 
	 System.out.println("==================");
   }//while
   
   
   
   
   
   
	}//main
}
