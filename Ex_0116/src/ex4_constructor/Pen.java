package ex4_constructor;

public class Pen {

	private String brand ;
	private String color ;
	private int price ;
	
	public Pen(String color, int price) {
		this.color= color;
		this.price= price;
		brand = "monami";
		
	}
	
	public Pen() {
		//System.out.println("pen�� ������");
		brand = "monami";
	    color = "black";
		price = 500;
	}
	
	public void result() {
		System.out.println("�귣�� : " + brand);
		System.out.println("���� : " + color);
		System.out.println("���� : " + price);
		System.out.println("===========");
	}

}

















