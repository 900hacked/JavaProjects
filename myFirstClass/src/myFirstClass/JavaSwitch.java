package myFirstClass;

public class JavaSwitch {

	public static void main(String[] args) {
		
		int day = 1;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
			default:
				System.out.println("Looking forward to the weekend");
		}
		
		//what i like about a certain car
		
		String carBrand = "rachael";
		switch (carBrand) {
		case "Toyota":
			System.out.println("This is a reliable car");
			break;
		case "Mercedes":
			System.out.println("This is a luxurious car");
			break;
		case "BMW":
			System.out.println("This is a fast car");
			break;
		case "Ford":
			System.out.println("This is a powerful car");
			break;
			default:
				System.out.println("This isnt available");
		}
		

	}

}
