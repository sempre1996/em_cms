package ex4_work;

import java.util.Random;

public class Updown {
	private int random = new Random().nextInt(50)+1;
    int cnt = 1;
    boolean result = true;

   public void check( int a ) {
	   if (a > random) {
		System.out.println("Down");
		cnt++;
	}else if( a < random) {
		System.out.println("Up");
		cnt++;
	}else {
	System.out.println("["+cnt+"]회 만에 정답!");
	result = false;
		
   }
    
   }  
}   
    
    
    
    
    
    
    
    
    
    
    

