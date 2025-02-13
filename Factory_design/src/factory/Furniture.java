package factory;

//inheriting from the product class
public class Furniture extends Product {
	private String material;
	
	//declaring the constructor
	public Furniture(String newMaterial, String pName, double cost) {
		super(pName, cost);
		material = newMaterial;
	}
	
	//getters and setters
	
	public String getMaterial() {
		return material;
	}
	
	public void setMaterial(String matFabric) {
		this.material = matFabric;
	}
	
	public void displayDetails() {
		System.out.println("Furniture: " + getName() + ", Price: " + getPrice() + ", Material: " + getMaterial());
	}
	
	
	

}
