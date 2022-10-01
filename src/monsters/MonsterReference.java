package monsters;

import programs.Utilities;

public interface MonsterReference {

	public static String getDetails(String name) {
		return Utilities.fileToString("./objects/monsters/" + Utilities.toSha(name));
	}
	
	public static void addMonster() {
		
	}
	
	public static void createCollection() {
		//check if it already exist otherwise make objects folder
		//inside that make a monsters folder
		//inside that but the core monster in it
		
	}
	
	public static boolean verifyCache(String name) {
		//checks that item reference is stored in collection
		return true;
	}
}
