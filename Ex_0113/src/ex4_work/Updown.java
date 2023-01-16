package ex4_work;

import java.util.Random;

public class Updown {
	//private int random = new Random().nextInt(50)+1;
    //int cnt = 1;
    //boolean result = true;

   //public void check( int a ) {
	  // if (a > random) {
		//System.out.println("Down");
		//cnt++;
	//}else if( a < random) {
		//System.out.println("Up");
		//cnt++;
	//}else {
	//System.out.println("["+cnt+"]회 만에 정답!");
	//result = false;
		
   //}
    
   //} 
	
	// Random rnd = new Random();
	// int random = rnd.nextint(50) + 1;
	
	private int random = new Random().nextInt(50)+1;
	private int count = 0;
	private boolean isEnd = false;
	
	public boolean checkResult( int n ) {
	   count++;	
	   if ( n < random ) {
		System.out.println("UP!");
	}else if( n > random ) {
		System.out.println("DOWN!");
	}else {
		System.out.println(count +"회 만에 정답!!");
		isEnd = true;
	}// else
	   return isEnd;
	}
	
	
	
	
	
	
	
	
}   
    
    
    
    
    
    
    
    
    
    
    

