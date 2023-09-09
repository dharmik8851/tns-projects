package interface_demo;

public class Customer {
	
	private String name;
	private String city;
	private int accNo;
	
	//default constructor
	public Customer() {
		super();
	}
	
	//parameterized constructor
	public Customer(String name, String city, int accNo) {
		super();
		this.name = name;
		this.city = city;
		this.accNo = accNo;
	}
	
	//getters and setters
	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	
	
	
}
