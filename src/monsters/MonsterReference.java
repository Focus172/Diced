package monsters;

import java.io.File;

import programs.Utilities;

public interface MonsterReference {

	public static String getDetails(String name) {
		return Utilities.fileToString("./objects/monsters/" + Utilities.toSha(name));
	}
	
	public static void addMonster(String name, String fileContents) {
		Utilities.makeFile("./objects/monsters/" + Utilities.toSha(name), fileContents);
		
	}
	
	public static void createCollection() {
		//check if it already exist otherwise make objects folder
		//inside that make a monsters folder
		//inside that but the core monster in it
		new File("objects").mkdir();
		new File("objects/monsters").mkdir();
		MonsterReference.addMonster("black bear", "4:2:d6:2d4:piercing:slashing:4");
		MonsterReference.addMonster("brown bear", "6:4:d8:2d6:piercing:slashing:2");
		MonsterReference.addMonster("giant eagle", "5:3:d6:2d6:piercing:slashing:2");
		
	}
	
	public static boolean verifyCache(String name) {
		//checks that item reference is stored in collection
		return true;
	}
}
