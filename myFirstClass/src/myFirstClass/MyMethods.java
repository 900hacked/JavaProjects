package myFirstClass;

public class MyMethods {
	public static void doriansMethod() {
		System.out.println("I will be a great coder");
	}
	
	public static void methods(int num) {
		System.out.println("The number is: " + num);
		
	}
	
	public static void add(int num1, int num2) {
		System.out.println("The sum is: " + (num1 + num2));
	}
	
	public static void myName(String fname) {
		System.out.println("My name is: " + fname);
	}
	
	public static void age(String name, int DOB) {
		System.out.println(name + " is " + (2024 - DOB));
	}
	
	public static void swimming() {
		System.out.println("I like Swimming");
	}

	public static void main(String[] args) {
		
		doriansMethod();
		swimming();
		
		methods(1);
		
		myName("Dorian");
		
		add(10,7);
		
		age("Kayla", 1998);

	}

}
