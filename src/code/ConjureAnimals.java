package code;

public class ConjureAnimals {
	
	private final String animalName;
	public final Animal animal;

	private int numberOfAnimals;
	
	//animals are listed as following
	//prof bonus, attacking stat, attack1 dice, attack2 dice, numberPerspell
	
	
	//getting animals can be from file explorer
	//you take the animal name and hash it and go to where that file is held
	//there also has to be some manager for adding new animals to hashMap like file system
	//also needs to able to verify intgrety over systems that it works
	
	
	public ConjureAnimals(String animalName, int level) {
		this.animalName = animalName;
		animal = AnimalHelper.getAnimal(animalName);
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
		return totalDamage;
	}
}
