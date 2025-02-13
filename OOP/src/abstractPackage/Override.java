package abstractPackage;

public class Override implements FirstInterface {
	
	public void color() {
		System.out.println("My favorite color is black");
	}
	
    public int age(int age) {
    	return age;
    }
	
	public void nationality() {
		System.out.println("I am Ugandan");
	}
	
	public String village(String village) {
		return village;
	}

	

	public static void main(String[] args) {
		
		Override myInfo = new Override();
		
		myInfo.color();
		System.out.println(myInfo.age(27));
		myInfo.nationality();
		System.out.println(myInfo.village("Kisoro"));

	}

}
