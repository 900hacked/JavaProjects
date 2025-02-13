package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular {

	public static void main(String[] args) {
		
		Pattern pattern = pattern.compile("Morning is my favourite part of the day", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("I");
		boolean matchFound = matcher.find();
		if(matchFound) {
			System.out.println("Match Found");
		} else {
			System.out.println("Match Not Found");
		}

	}

}
