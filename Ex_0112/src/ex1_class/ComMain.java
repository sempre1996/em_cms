package ex1_class;



public class ComMain {

	public static void main(String[] args) {
		
	
	Computer c1 = new Computer();	
	c1.getInfo();
	
	
	Computer c2 = new Computer();
	c2.getInfo();
	
	
	Computer c3 = new Computer();
	c3.ssd = 512;
	//c3.brand = "Samsung"; (private(접근제한자)을 사용해서 금지댐)
	c3.getInfo();
	
	
	}//main
	
	
	
}
