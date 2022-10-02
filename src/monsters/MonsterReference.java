package monsters;

import java.io.File;

import programs.Utilities;

public interface MonsterReference {

	public static String getDetails(String name) {
		return Utilities.fileToString("./objects/monsters/" + Utilities.toSha(name));
	}
	
	public static void addBasicMonster(String name, String fileContents) {
		Utilities.makeFile("./objects/monsters/" + Utilities.toSha(name), fileContents);
		
	}
	
	public static void createCollection() {
		//check if it already exist otherwise make objects folder
		//inside that make a monsters folder
		//inside that but the core monster in it
		new File("objects").mkdir();
		new File("objects/monsters").mkdir();
		MonsterReference.addBasicMonster("black bear", "4:2:d6:2d4:piercing:slashing:4");
		MonsterReference.addBasicMonster("brown bear", "6:4:d8:2d6:piercing:slashing:2");
		MonsterReference.addBasicMonster("giant eagle", "5:3:d6:2d6:piercing:slashing:2");
		MonsterReference.addBasicMonster("ape", "5:3:d6:d6:bludgeoning:bludgeoning:4");
		
	}
	
	//checks that item reference is stored in collection
	public static boolean verifyCache(String name) {
		return new File("./objects/monsters/" + Utilities.toSha(name)).exists();
	}
	
	//only should be called when requested by user but goes through each item
	//compares it to a master list held somewhere else to make sure there is nothing missing
	public static boolean verifyWholeCache() {
		return false;
	}
}
