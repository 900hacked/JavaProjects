package linked;

import java.util.LinkedList;

public class MyLinkedList {

	public static void main(String[] args) {
		
		LinkedList <Person> num = new LinkedList<Person>();
		
		
		
		num.add(new Person("Dorian","Kalisa", 20));
		num.add(new Person("John","Baptist",30));
		num.add(new Person("Maria","carol",25));
		num.add(new Person("Malcom","Nathan",28));
		num.add(new Person("Emma","Joseph", 45));
		
		
		System.out.println(num.get(0).firstName + " " + num.get(0).age + " " + num.get(0).lastName );

	}

}
