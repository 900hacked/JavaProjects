package factory;

public class Meth {

	public static void main(String[] args) {
		Electronics elecObj = new Electronics("Phone", 105.0, "Iphone" );
		Multiple multObj = new Multiple();
		Multiple tipObj = new Multiple("Kalisa", 20);
		multObj.setName("Dorian");
		
	System.out.println(elecObj.getName());	
	System.out.println(elecObj.getPrice());
	
	System.out.println(multObj.getName());
	System.out.println(tipObj.getName());

	}

}
