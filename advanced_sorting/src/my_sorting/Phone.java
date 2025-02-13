package my_sorting;

public class Phone {
	
	private String nameOfPhone;
	private String colorOfPhone;
	private int yearOfManufacture;
	
	

	public Phone(String nameOfPhone, String colorOfPhone, int yearOfManufacture) {
		super();
		this.nameOfPhone = nameOfPhone;
		this.colorOfPhone = colorOfPhone;
		this.yearOfManufacture = yearOfManufacture;
	}
	
	



	public String getNameOfPhone() {
		return nameOfPhone;
	}





	public void setNameOfPhone(String nameOfPhone) {
		this.nameOfPhone = nameOfPhone;
	}





	public String getColorOfPhone() {
		return colorOfPhone;
	}





	public void setColorOfPhone(String colorOfPhone) {
		this.colorOfPhone = colorOfPhone;
	}





	public int getYearOfManufacture() {
		return yearOfManufacture;
	}





	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}





	public static void main(String[] args) {
		
		Phone fone = new Phone("Iphone X", "Black", 2017);

	}





	@Override
	public String toString() {
		return "Phone [nameOfPhone=" + nameOfPhone + ", colorOfPhone=" + colorOfPhone + ", yearOfManufacture="
				+ yearOfManufacture + "]";
	}

}
