package regular_expressions;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

//Validating a password

public class PasswordValidator {

	public static void main(String[] args) {
		
		String example = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
		String password = "learningg";
		Pattern pattern = Pattern.compile(example);
		Matcher matcher = pattern.matcher(password);
		boolean matchFound = matcher.find();
		
		if(matchFound) {
			System.out.println("Valid Password");
		} else {
			System.out.println("Invalid Password");
		}

	}

}
