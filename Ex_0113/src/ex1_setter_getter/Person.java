package ex1_setter_getter;

public class Person {
  // setter & getter : private���� ������� �Ӽ��鿡 ������ �� �ֵ���
	
	
	private String brand = "SamSung";
	private String phone;
	private String name;
	private int age;
	
	public String getBrand() {
		return brand;
	}
	
	// this : ���� Ŭ���� �ڽ�
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
