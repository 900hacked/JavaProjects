package exception;

public class Exceptions {
	
	static void checkAge(int age) {
		
		if(age < 18) {
			throw new ArithmeticException("Access Denied - you must be 18 years or older ");
		}
		else {
			System.out.println("Access Granted - you are old enough");
		}
	}

	public static void main(String[] args) {
		
		try {
			 int[] myNumbers = {1, 2, 3};
			    System.out.println(myNumbers[10]);
		} catch (Exception e) {
			System.out.println("Something went wrong " + e);
		} finally {
			System.out.println("the 'try catch' is finished ");
		}
		
		checkAge(18);

	}

}
