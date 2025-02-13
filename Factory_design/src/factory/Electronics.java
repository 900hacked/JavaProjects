package factory;

//inheriting from the product class
public class Electronics extends Product{
	private String brand;
	
	// declaring a constructor
	public Electronics(String pName, double cost, String brandName) {
		super(pName, cost);
		brand = brandName;
	}
	
	
	// getters and setters
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String newBrand) {
		this.brand = newBrand;
	}
	
	
	public void displayDetails() {
		System.out.println("Electronics: " + getName() + ", Price: $" + getPrice() + ", Brand: " + getBrand());
	}
	

	public static void main(String[] args) {
		

	}

}
