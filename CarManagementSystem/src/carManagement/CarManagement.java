package carManagement;

public class CarManagement {

	public static void main(String[] args) {
		
		// declaring variables
		
		String carsMake, carsModel;
		int year, mileage;
		double price;
		boolean isNew;
		
		//type casting
		price = 100000.12;
		int myPrice = (int) price;
		System.out.println(myPrice);
		
		
		
		//depriciation formula
		price = 20000;
		double depriciationRate = 0.05;
		int yearsInUse = 3;
		//After 1 year
		
//		double depriciatedPrice = price * depriciationRate; // repeating depriciated price
//		System.out.println("The depriciated price is: " + depriciatedPrice); //repeating	print depriciated price
//		
//	
//		System.out.println("The car will cost this after 1 year: " + (price - depriciatedPrice)); //repeating cost of the car
//		
//		double priceOfCarAfterOneYear = price - depriciatedPrice;// repeating
//		//End of 1 year
//		
//		//after 2 years
//		double depriciatedPrice2 = priceOfCarAfterOneYear * depriciationRate; //repeating depriciated price 2
//		System.out.println("The depriciated price is: " + depriciatedPrice2); //repeating print depriciated price 
//		
//		System.out.println("The cost of the car after 2 years is: " + (priceOfCarAfterOneYear - depriciatedPrice2 )); // repeating cost of the car 2
//		
//		//after 3 years
//		double priceOfCarAfterTwoYear = priceOfCarAfterOneYear - depriciatedPrice2; //repeating
//		double depriciatedPrice3 = priceOfCarAfterTwoYear * depriciationRate;// repeating depriciated price 3
//		System.out.println("The depriciated price is: " + depriciatedPrice3); //repeating print depreciated price 3
//		
//		System.out.println("The cost of the car after 3 years is: " + (priceOfCarAfterTwoYear - depriciatedPrice3));//repeating 
		
		
		double depriciatedCost = 0;
		double priceOfCar = 20000;
		final double depriciationRates = 0.05;
		
		for (int i = 0; i < yearsInUse; i++) {
			depriciatedCost = priceOfCar * depriciationRates;
			priceOfCar = priceOfCar - depriciatedCost;
			System.out.println("The Price of the car is: " + priceOfCar);
			if (priceOfCar < 1000) {
				break;
			}
		}
		System.out.println("The current cost of the car is: " + priceOfCar);
		
		for (int a = 0; a <20; a++) {
			System.out.println("We are printing out 20 numbers: " + a);
			if(a == 5) {
				break;
			}
		}
		
	
			
		// Operators and math
	    
				System.out.print("Cars Age: ");
				year = -60;
				int currentYear = 2024;
				int carsAge = -60;
				System.out.println(carsAge);
		
		
		//if..else to determine if the car is used
		
		
		
		isNew = true;
		if (isNew) {
			System.out.println("The car is new.");
		}
		else {
			System.out.println("The car is used.");
		}
		
		//additional criteria for used cars
		mileage = 150000;
		
		if (carsAge > 10) {
			System.out.println("This is an Old model");
		} 
		else if (carsAge < 0) {
			System.out.println("Invalid Age");
		}
		else if (mileage > 100000) {
			System.out.println("High Mileage");
		}
		else {
			System.out.println("Standard used car");
		}
		
		//assign a discount if the car is new
		
		String discount = (isNew)? "You have a 10% discount" : "You have a 15% discount";
		System.out.println(discount);
		
		//switch statements for different tax rates based on fuel
		
		double taxRate = 0;
		
		String fuel = "Electric";
		switch (fuel) {
		case "Petrol":
			taxRate = 0.12;
			double discounts = priceOfCar * taxRate;
			System.out.println("The current cost for a Petrol car will be: " + (priceOfCar - discounts));
			break;
		case "Diesel":
			taxRate = 0.10;
			double discounts2 = priceOfCar * taxRate;
			System.out.println("The current cost for a diesel car will be: " + (priceOfCar - discounts2));
			break;
		case "Electric":
			taxRate = 0.5;
			double discounts3 = priceOfCar * taxRate;
			System.out.println("The current cost for an Electric car will be: " + (priceOfCar - discounts3));
			break;
			default:
				System.out.println("The tax rate does not exist");
		}
		
		
		
		
		
		// while loop that decreases price by 2% until it reaches 5000
		
		while (priceOfCar >= 5000) {
			priceOfCar = priceOfCar * 0.02;
			System.out.println("the price of car is: " + priceOfCar);
		}
		
		//continue and break statement
		
		
		
		
		
		
		// string of cars
		
		String [] carModels = {"Mercedes","Toyota","Volvo","Range Rover","BMW"};
		for (String i : carModels) {
			System.out.println(i);
		}
		int [] carPrices = {100000,20000,30000,90000,60000};
		for (int counter = 0; counter < carModels.length; counter++) {
			System.out.println(carModels[counter] + ":" + carPrices[counter]);
		}

	}

}
