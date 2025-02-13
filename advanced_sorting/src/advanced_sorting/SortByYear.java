package advanced_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortByYear implements Comparator {


	@Override
	public int compare(Object o1, Object o2) {
		Car car1 = (Car) o1;
		Car car2 = (Car) o2;
		
		if(car1.getYearOfManufacture() > car2.getYearOfManufacture()) {
			return -1;
		}
		if(car1.getYearOfManufacture() < car2.getYearOfManufacture()) {
			return 1;
		} else {
			return 0;
		}
		
	}
	
	public static void main(String[] args) {
		
		
		ArrayList<Car> myCars = new ArrayList<Car>();
		
		myCars.add(new Car("BMW X7", 2020, "black"));
		myCars.add(new Car("Toyota premio", 2004, "White"));
		myCars.add(new Car("Mercedes C63", 2012, "Red"));
		myCars.add(new Car("Audi A4", 2019, "Blue"));
		
		Comparator myComparator = new SortByYear();
	    Collections.sort(myCars, myComparator);
		
		System.out.println(myCars);
		

	}


}
