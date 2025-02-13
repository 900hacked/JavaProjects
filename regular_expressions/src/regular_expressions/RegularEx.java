package regular_expressions;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegularEx {
	
	String password;
	static String example = "^(?=.*[A-Za-z])[A-Za-z]{8,}$";
	
	public static String pass(String password) {
		Pattern pattern = Pattern.compile(example);
		Matcher matcher = pattern.matcher(password);
		boolean matchFound = matcher.find();
		
		if(matchFound) {
			return "Valid Password";
		} else {
			return "Invalid Password";
		}
	}
	
	
	
	

	public static void main(String[] args) {
		
		System.out.println(pass("Learning2"));
		

	}

}
