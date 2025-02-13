package classes;

public class School {

	public static void main(String[] args) {
		
//		Person details = new Person("Kalisa", 12, 1.80, false, 456783965L);
		Person.height = 1.85;
		
		Person def = new Person();
		
		def.setAge(34);
		def.setName("Elijah");
		def.setALevel(true);
		def.setStudentNo(987654321L);
		System.out.println(def.name);
		System.out.println(Person.height);
		System.out.println(def.getAge());
		System.out.println(def.getALevel());
		System.out.println(def.getStudentNo());
		
		
		

	}

}
