package myFirstClass;

public class Comparisons {

	public static void main(String[] args) {
		
		//Equal to
		int x = 10;
		int y = 5;
		
		System.out.println(x == y);
		
		//Not equal to
		
		System.out.println(x != y);
		
		//Greater than
		
		System.out.println(x > y);
		
		//less than
		
		System.out.println(x < y);
		
		//Greater than or equal to
		
		System.out.println(x >= y);
		
		//less than or equal to
		
		System.out.println(x <= y);
		
		//Logical and
		
		int a = 5;
		int b = 7;
		
		System.out.println(a > b && b > a); 
		
		// Logical or
		
		System.out.println(a > b || b < a);
		
		//Logical not
		
		System.out.println(!(a > b && b > a));
		
		

	}

}
