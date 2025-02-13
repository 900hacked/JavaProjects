package classes;

public class Person {
	
	String name;
	private int age;
	static double height;
	private boolean aLevel;
	private long studentNo;
	
	public Person(String theName, int theAge, double theHeight, boolean theALevel, long theStudentNo) {
		name = theName;
		age = theAge;
		height = theHeight;
		aLevel = theALevel;
		studentNo = theStudentNo;
		
	}
	
	public Person() {
		
	}
	
	public int getAge() {
		return age;
	}
	
	public boolean getALevel() {
		return aLevel;
	}
	
	public long getStudentNo() {
		return studentNo;
	}
	
	public void setAge(int newAge) {
		this.age = newAge;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setALevel(boolean newALevel) {
		this.aLevel = newALevel;
	}
	
	public void setStudentNo(long newStudentNo) {
		this.studentNo = newStudentNo;
	}
	
	

	public static void main(String[] args) {
		
		Person attributes = new Person("Dorian ", 20, 1.75, true, 92345781L);
		
		System.out.println(attributes.age);
		
		System.out.println(Person.height);
		

	}

}
