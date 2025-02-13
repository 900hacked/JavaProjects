package factory;

public abstract class Product {
	
	private String productName;
	private double price;
	
	public Product(String pName, double cost) {
		productName = pName;
		price = cost;
	}
	
	//setters and getters
	
	public String getName() {
		return productName;
	}
	
	public void setName(String newName) {
		this.productName = newName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double newPrice) {
		this.price = newPrice;
	}
	
	
	

	public static void main(String[] args) {
		
		int myInt = 9;
		double myDouble = myInt;
		
		System.out.println(myInt);
		System.out.println(myDouble);
		
		double double1 = 6.76;
		int int2 = (int)double1;
		
		System.out.println(int2);
		
		System.out.println(Math.abs(-65));
	}

}
