package methods;

public class Methods { 
	
	static int num = 40;
	
	
	public static String program() {
		
		System.out.println(num);
		return "I will become a good programmer soon";
		
	}
	
	public static boolean truth() {
		System.out.println(num);
		
		return false;
	}
	
	public static double calculate(double a, double b) {
		return a / b;
	}
	
	public static double calculate(double b) {
		return  b;
	}
	
	public static double calculate() {
		return  4.5;
	}
	
	public static double calculate(int v, int m) {
		return  v + m;
	}

	public static void main(String[] args) {
		
		String x = program();
		
		System.out.println(x);
		
		boolean y = truth();
		
		System.out.println(y);
		
		 System.out.println(calculate(1000, 59));
		 
		 System.out.println(calculate(10, 40));
		

	}

}
