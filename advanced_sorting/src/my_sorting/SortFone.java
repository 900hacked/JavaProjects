package my_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortFone implements Comparator{

	

	@Override
	public int compare(Object o1, Object o2) {
		
		Phone phone1 = (Phone) o1;
		Phone phone2 = (Phone) o2;
		
		if(phone1.getNameOfPhone().length() > phone2.getNameOfPhone().length()) {
			return -1;
		}
		if(phone1.getNameOfPhone().length() < phone2.getNameOfPhone().length()) {
			return 1;
		} else {
			return 0;
		}
		
		
	}
	
	
    public static void main(String[] args) {
		
    	ArrayList<Phone> myPhone = new ArrayList<Phone>();
    	
    	myPhone.add(new Phone("Iphone 12", "Blue", 2020));
    	myPhone.add(new Phone("Iphone 16", "Pink", 2024));
    	myPhone.add(new Phone("Iphone X", "Black", 2017));
    	myPhone.add(new Phone("Iphone 5", "White", 2015));
    	
    	Comparator myComparator = new SortFone();
    	Collections.sort(myPhone, myComparator);
    	
    	System.out.println(myPhone);

	}

}
