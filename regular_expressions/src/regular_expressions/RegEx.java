package regular_expressions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

	public static void main(String[] args) {
	 
		String password = "nnnumber";
		Pattern pattern = Pattern.compile("n{4,}", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(password);
		boolean matchFound = matcher.find();
		
		if(matchFound) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid Password");
		}

	}

}
