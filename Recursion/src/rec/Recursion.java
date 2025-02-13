package rec;

public class Recursion {
	
//	public static void name() {
//		System.out.println("I am learning Java");
//		name();
//	}
	public static void school() {
		System.out.println("I study at ISBAT University");
	}
	public static void age() {
		System.out.println("Hey, I am 15 years old");
		school();
	}
	public static void name(int num) {
		System.out.println("Ethan");
		if (num > 10) {
			name(num - 1);
			
		}
		
	}

	public static void main(String[] args) {
		
		name(20);
		
		//Ethan
		//hey, I am 15 years old
		//I study at ISBAT University
		//I study at ISBAt University
		
	int result = sum(10);
	System.out.println(result);
	
//	//halting
	int equals = sum(5,10);
	System.out.println(equals);
	}
	
	public static int sum(int k) {
		if (k > 0) {
			return k + sum(k - 1);
		}
		else {
			return 0;
		}
	}
	 
	//55
	//halting
	public static int sum(int start, int end) {
		if (end > start) {
			return end + sum(start, end - 1);
		}
		else {
			return end;
		}
		
//		10,  9,  8,  7,  6, 5
		
		
	}
}
	


