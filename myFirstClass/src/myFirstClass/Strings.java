package myFirstClass;

public class Strings {

	public static void main(String[] args) {
		
		//Length of a string
		
		String txt = "Invincible";
		
		System.out.println("Length of the text is : " + txt.length());
		
		//Uppercase
		
		System.out.println(txt.toUpperCase());
		
		//lowercase
		
		System.out.println(txt.toLowerCase());
		
		//finding index
		
		System.out.println(txt.indexOf("b"));
		
		//Concatenation
		
		String firstname = "Dorian ";
		String lastname = "Kalisa";
		System.out.println(firstname  + lastname);
		
		System.out.println(firstname.concat(lastname));
		
		// String Special Characters
		
		String text = "We are the so called \"Vikings\" from the north";
		
		System.out.println(text);
		
		
		
		// Boolean
		
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(isJavaFun);     
		System.out.println(isFishTasty);
		
		System.out.println(5 < 10);
		
		

	}

}
