package recap;

public class CountWords {
	
	public static int count(String words) {
		
		int countWords = words.split("\\s").length;
		return countWords;
	}

	public static void main(String[] args) {
		
		System.out.println(count("One two"));
		
		System.out.println(count("My name is Rita"));
		

	}

}
