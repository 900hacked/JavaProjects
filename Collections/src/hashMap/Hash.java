package hashMap;

import java.util.HashMap;

public class Hash {

	public static void main(String[] args) {
		
		HashMap <String, String> capitalCities = new HashMap <String, String>();
		
		capitalCities.put("Uganda", "Kampala");
		capitalCities.put("Kenya", "Nairobi");
		capitalCities.put("Ghana", "Accra");
		capitalCities.put("England", "London");
		
		System.out.println(capitalCities.get("Kenya"));
		capitalCities.remove("Ghana");
//		capitalCities.clear();
		System.out.println(capitalCities.size());
		
		System.out.println(capitalCities);
		
		for(String i : capitalCities.keySet()) {
			System.out.println("Capital city of " + i + " is " + capitalCities.get(i));
		}
		
		
		HashMap <Character, Boolean> language = new HashMap <Character, Boolean>();
		
		language.put('A', true);
		language.put('B', false);
		language.put('C', true);
		
		System.out.println(language);
		

	}

}
