package advanced_sorting;

public class Car {
	
	private String nameOfCar;
	private int yearOfManufacture;
	private String colorOfCar;
	
	
	

	public Car(String nameOfCar, int yearOfManufacture, String colorOfCar) {
	
		this.nameOfCar = nameOfCar;
		this.yearOfManufacture = yearOfManufacture;
		this.colorOfCar = colorOfCar;
	}




	@Override
	public String toString() {
		return "Car [nameOfCar=" + nameOfCar + ", yearOfManufacture=" + yearOfManufacture + ", colorOfCar=" + colorOfCar
				+ "]";
	}




	public String getNameOfCar() {
		return nameOfCar;
	}




	public void setNameOfCar(String nameOfCar) {
		this.nameOfCar = nameOfCar;
	}




	public int getYearOfManufacture() {
		return yearOfManufacture;
	}




	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}




	public String getColorOfCar() {
		return colorOfCar;
	}




	public void setColorOfCar(String colorOfCar) {
		this.colorOfCar = colorOfCar;
	}




	public static void main(String[] args) {
		
		Car car1 = new Car("Toyota", 2009, "Black");
		Car car2 = new Car("Mercedes", 2014, "Red");
		
       int x = 40;
       int y = 50;
	}

}
