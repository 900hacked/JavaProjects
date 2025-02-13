package myFirstClass;

public class ElseIf {

	public static void main(String[] args) {
		
		String theOfficialLanguage = "dorian";
		
		if (theOfficialLanguage == "English") {
			System.out.println("This Country was colonised by Britain");
		}
		else if(theOfficialLanguage == "French") {
			System.out.println("This country was colonised by france");
		}
		else if(theOfficialLanguage == "Portuguese") {
			System.out.println("The country was colonised by Portugal");
		}
		else if(theOfficialLanguage == "Spanish") {
			System.out.println("The country was colonised by Spain");
		}
		else {
			System.out.println("This person is from Egypt");
		}
		
		int dayOfTheWeek = 5;
		
		if (dayOfTheWeek == 1) {
			System.out.println("Monday");
		}
		else if (dayOfTheWeek == 2) {
			System.out.println("Tuesday");
		}
		else if (dayOfTheWeek == 3) {
			System.out.println("Wednesday");
		}
		else if (dayOfTheWeek == 4) {
			System.out.println("Thursday");
		}
		else if (dayOfTheWeek == 5) {
			System.out.println("Friday");
		}
		else if (dayOfTheWeek == 6) {
			System.out.println("Saturday");
		}
		else if (dayOfTheWeek == 7) {
			System.out.println("Sunday");
		}
		else {
			System.out.println("This does not exist");
		}
		
        String Food = "Fruits";		
		String Nutrition = (Food == "Fruits")? "it is healthy": "it is not healthy";
		System.out.println(Nutrition);
		
		int age = 19;
		String group = (age < 18)? "Is a minor": "is an adult";
		System.out.println(group);
		
				

	}

}
