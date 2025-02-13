package classes;

public class Classez {
	int id;
	String orderName;
	private String customerName = "John";
	int customersContact;
	final String DOB = "25 - 11 - 1999";
	
	public void text() {
		System.out.println("I like coding");
	}
	
	public static void cars() {
		System.out.println("I love cars");
	}
	

	public static void main(String[] args) {
		
		cars();
		
		Classez dorian = new Classez();
		Classez kalisa = new Classez();
		Classez MyCar = new Classez();
		
		MyCar.customerName = "Elijah";
		
		System.out.println(MyCar.customerName);
		System.out.println(kalisa.customerName);
		
		// this field can't be reassigned
//		kalisa.DOB = "30 - 10 - 04"; 
				

	}

}
