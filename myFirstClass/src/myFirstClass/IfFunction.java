package myFirstClass;

public class IfFunction {

	public static void main(String[] args) {
		
		//Matthew has children and now the gov't is giving out 50k to whoever has children
		
		String Matthew = "has children";
		if(Matthew == "has children") {
			System.out.println("He will get the money");
		}
		
		// Martha is 8yrs old and it is illegal to have children below 18
		
		int Martha = 18;
		if(Martha < 18) {
			System.out.println("She cannot have children");
		}
		
		// a young man btn 10 and 50kgs is underweight
        
		int weight = 0;
		if(weight > 10 && weight <50) {
			System.out.println("He is underweight");
		}
		
		// From 80 and above you qualify for pension 
		
		int age = 80;
		if (age >= 80) {
			System.out.println("You qualify for pension");
		}
			else {
				System.out.println("You dont qualify for pension");
			}
		
		// if you earn btn 5M and 10M you are an average Ugandan and else you have no grouping
		
		int salary = 0;
		if (salary > 5000000 && salary < 10000000) {
			System.out.println("You are an average Ugandan");
		}
		else {
			System.out.println("You have no grouping");
		}
		
		

	}

}
