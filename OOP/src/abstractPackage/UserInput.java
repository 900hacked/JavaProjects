package abstractPackage;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner myScan = new Scanner(System.in);
		
//		System.out.println("Please Enter your name: ");
//		
//		String myName = myScan.nextLine();
//		
//		System.out.println("My name is: " + myName);
		
		System.out.println("Please enter first number: ");
		
		int num1 = myScan.nextInt();
		
		System.out.println("Please enter second number: ");
		
		int num2 = myScan.nextInt();
		
		System.out.println("The sum is: " + (num1 + num2));

	}

}
