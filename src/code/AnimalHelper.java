package code;

import java.util.HashMap;

public interface AnimalHelper {

	public static HashMap<String, Animal> makeMap() {
		HashMap<String, Animal> aMap = new HashMap<String, Animal>();
		
		aMap.put("elk", new Animal("elk", 5, 3, "3d6", "", 8));
		
		return aMap;
	}
	
}
