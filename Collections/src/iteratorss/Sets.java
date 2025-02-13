package iteratorss;

import java.util.HashSet;
import java.util.Iterator;

public class Sets {

	public static void main(String[] args) {
		
		HashSet <String> names = new HashSet<String>();
		
		names.add("James");
		names.add("Joseph");
		names.add("Adam");
		names.add("Martha");
		
		Iterator<String> it = names.iterator();
		
		//print out all items
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//to be completed
		while (it.hasNext()) {
			String i = it.next();
			if(i == "Martha") {
				it.remove();
			}
		}
		
		System.out.println(names);

	}

}
