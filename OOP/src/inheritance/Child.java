package inheritance;


public class Child extends Parent {
	
	public int Age = 12;
	public String School ="Kinder care";
	static String attribute = "Hello";

	public static void main(String[] args) {
		
		Child myKid = new Child();
		
		System.out.println(myKid.job);
		System.out.println(myKid.workPlace());
		
		System.out.println(attribute);
		
		

	}

}
