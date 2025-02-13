package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class MyArrayList {

	public static void main(String[] args) {
	
		//Array-list
	ArrayList <String> cars = new ArrayList <String>();
	
	cars.add("Toyota");
	cars.add("Mercedes-Benz");
	cars.add("Lexus");
	cars.add("Nissan");
	cars.add(0,"Lorry"); //to add an item at a specific index
	
	cars.set(4, "BMW");// replace items
	cars.remove(0); // to remove an item
	System.out.println(cars.size()); // size of the array list
	Collections.sort(cars); // sort cars alphabetically
	
	
	//to call an item at a specific index
	System.out.println("The car at index 3 is: " + cars.get(3));
	
	System.out.println(cars);
	
	for(String X : cars) {
		System.out.println(X);
		
		
	}
	
	cars.clear(); //to clear all items in the array
	
	System.out.println(cars);
		

	}

}
