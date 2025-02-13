package myFirstClass;

public class DataTypes {

	public static void main(String[] args) {
		
//		variable of type string
		String name2 = "Dorian";
		System.out.println(name2);
		
		String car = "Toyota";
		System.out.println(car);
		
//		variable of type int
		int number1 = 2;
		int number2 = 3;
		System.out.println(number1 + number2);
		
//		variable of type float
		float decimal1 = 19.99f;
		System.out.println(decimal1);
		
		float decimal2 = 15.80f;
		System.out.println(decimal2);
		
//		variable of type char
		char letter = 'A';
		System.out.println(letter);
		
		char letter2 = 'B';
		System.out.println(letter2);
		
//		variable of type boolean
		boolean schoolchildren = true;
		System.out.println(schoolchildren);
		
		boolean winner = false;
		System.out.println(winner);
		
//		Reassigning a variable
		number1 = 50;
		System.out.println(number1);
		
//		print variables
		String name = "Dorian";
		System.out.println("Hello " + name);
		
//		adding two variables of type string
		String firstName = "Ben ";
		String lastName = "Johnson";
		String fullName = firstName + lastName;
		System.out.println(fullName);
		
//		declaring multiple variables
		String city="Kampala ", country="Uganda ", gender="Male";
		String details = city + country + gender;
		System.out.println(details);
		
//		One value to multiple variables
		int a,b,c;
		a=b=c=20;
		System.out.println(a+b);
		
		

	}

}
