package myFirstClass;

public class WideningCasting {

	public static void main(String[] args) {
		
		//widening casting
		
		int myInt = 20;
		double myDouble = myInt;
		
		System.out.println(myInt);
		System.out.println(myDouble);
		
		
		//Narrowing casting
		
		double myDecimal = 9.78d;
		int myInteger = (int) myDecimal;
		
		System.out.println(myDecimal);
		System.out.println(myInteger);
		
		int num1 = 30000;
		byte myByte = (byte) num1;
		
		System.out.println(num1);
		System.out.println(myByte);

	}

}
