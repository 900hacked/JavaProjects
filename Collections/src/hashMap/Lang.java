package hashMap;

import java.util.HashMap;

public class Lang {
	private String name;
	private int age;
	

	public Lang(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public static void main(String[] args) {
		
		HashMap<String, Lang> learn = new HashMap<String, Lang>();
		
		learn.put("Person One", new Lang("Daria", 16));
		learn.put("Person two", new Lang("Martha", 20));
		learn.put("Person three", new Lang("Brandon", 21));
		learn.put("Person Four", new Lang("Malcom",22));
		
		System.out.println(learn.get("Person One").name + " is " + learn.get("Person One").age + " years old ");
		
		for (String i : learn.keySet()) {
			System.out.println(i + " is " +  learn.get(i).name + " who is " + learn.get(i).age + " years old ");
		}

	}

}
