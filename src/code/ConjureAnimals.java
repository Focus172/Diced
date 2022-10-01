package code;

import java.util.HashMap;

public class ConjureAnimals {

	private HashMap<String, Animal> animals = AnimalHelper.makeMap();
	
	private final String animalName;
	public final Animal animal;

	private int numberOfAnimals;
	
	//animals are listed as following
	//prof bonus, attacking stat, attack1 dice, attack2 dice, numberPerspell
	
	
	
	public ConjureAnimals(String animalName, int level) {
		this.animalName = animalName;
		animal = animals.get(animalName);
		numberOfAnimals = animal.numberOf;
		
	}
	
	public void setAnimals(int newAnimals) {
		
	}
	
	public String turn(int ac) {
		return numberOfAnimals + 
				" " + animalName +
				" hit 4 times and crit 1 time for a total of " + runDamage(ac) + " bludgeoning damage";
	}
	
	private int runDamage(int ac) {
		int totalDamage = 0;
		for (int i = 0; i < numberOfAnimals; i++) {
			int toHit = Dice.roll(20) + animal.toHit;
			
			//first set of damage
			if (toHit == 20 + animal.toHit) {
				//do crit stuff
			} else if (toHit >= ac) {
				//do normal damage
			} else {
				//still count data from miss
			}
			
			//second set of attacks if any
			
		}
		return 0;
	}
}
