package recap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Recap {
	
	//Reverse a String
	
	public static String reversed(String original) {
		String reversedStr = ""; 
		for(int i = 0; i < original.length(); i++) {
			reversedStr = original.charAt(i) + reversedStr;
		}
		return "Reversed String: " + reversedStr;
	}
	
	//Sum of Array
	
	public static int arrays(int[] numbers) {
		
		int sum = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return  sum;
	}
	
	//Convert String to array
	
	public static char chara() {
		String str = "My String";
		
		char[] myArray = str.toCharArray();
		
		return myArray[1];
	}
	
	//sort an array
	//problem
	
	public static String[] cloth(String[] brands) {
		 
		Arrays.sort(brands);
		
		return brands;
	}
	
	//Array average
	
	public static double average(int[] ages) {
		
		
		float avg, sum = 0;
		int length  = ages.length;
		
		
		//this is a for each loop
		for (int age : ages) {
			  sum += age;
			}
		
		avg = sum / length;
		
		return  avg;
		
		
	}
	
	// find smallest element
	
	public static int small(int[] arr) {
		
		
		
		//create a variable
		int smallestItem = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < smallestItem) {
				smallestItem = arr[i];
			}
			
		}
		return smallestItem;
		
	}
	
	public static int large(int[] big) {
		
		
		
		int largestItem = big[0];
		
		for(int i = 0; i < big.length; i++) {
			if(big[i] > largestItem) {
				largestItem = big[i];
			}
		}
		return largestItem;
	}
	
	//loop through an array
	public static void cars() {
		ArrayList<String> car = new ArrayList<>();
		
		car.add("Toyota");
		car.add("Subaru");
		car.add("Mercedes");
		car.add("Range rover");
		
		for(String i : car) {
			System.out.println(i);
		}
		
		
	}
	
	//hashmap loop
	
	public static void name(HashMap<String, String> names) {
		
		
		for(String i : names.keySet()) {
			System.out.println("key: " + i + " value: " + names.get(i));
		}
	}
	
	//loop through an enum
	enum level{
		HIGH,
		MEDIUM,
		LOW;
	}
	
	//area of a rectangle
	public static int rectangle(int length, int width) {
		
		return length * width;
	}
	
	// even or odd numbers
	public static String numbers(int num) {
		if (num % 2 == 0) {
			return "This is Even";
		}
		else {
			return "This is Odd";
		}
	}
	
	//positive or negative
	
	public static String integers(int sign) {
		if (sign > 0) {
			return "this is positive";
		}else if(sign < 0) {
			return "This is negative";
		}else {
			return "Inavlid";
		}
	}
	
	

	public static void main(String[] args) {
		
		System.out.println(reversed("Climate"));
		
		int[] arr ={1,2,3,4,5};
		
		int[] err = {13,40,57,38,100};
		
		System.out.println(arrays(arr));
		
		System.out.println(arrays(err));
		
//		String[] bran = {"Adidas","Nike","Puma","Reebok","New-Balance"};
//		
//		System.out.println(cloth(bran));
		
		int[] aver =  {18,20,25,36,43,50};
		System.out.println(average(aver));
		
		int[] less= {23,4,54,6,13,67,10,-34,1,2,-4,-2};
		
		System.out.println(small(aver));
		
		int[] bigger = {50,30,12,100,67,150,99};
		
		System.out.println(large(less));
		
		cars();
		
		HashMap<String, String> names = new HashMap<>();
		
		names.put("Name: ", "Paul");
		names.put("Age ", "25");
		names.put("Occupation ", "Software Engineer");
		names.put("Status: ", "Single");
		
		name(names);
		
		//looping through an Enum
		
		for(level myVar : level.values()) {
			System.out.println(myVar);
		}
		
		//area of a rectangle
		
		System.out.println(rectangle(5,10));
		
		//even or odd
		
		System.out.println(numbers(3));
		
		//positive or negative
		
		System.out.println(integers(-2));
		
		//square root
		
		System.out.println(Math.sqrt(64));
		
		//Random Number
		
		System.out.println(Math.random());
		


		
		
		
		
		
		
		

	}

}
