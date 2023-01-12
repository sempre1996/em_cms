package ex3_method;

public class MetMain {
     public static void main(String[] args) {
		
    	 Method1 m1 = new Method1();
    	 m1.test1();
    	 
    	 int su = 100;
    	 m1.test2(su);
    	 System.out.println( "su : " + su);
    	 
    	 
    	 
    	 //m1.test3("ȫ�浿", 20);
    	 String res = m1.test3("ȫ�浿", 20);
    	 System.out.println(res);
    	 
    	 res = m1.test3("kim",22);
    	 System.out.println(res);
    	 
    	 
    	 
    	 
    	 
    	 
    	 
	}// main
}
